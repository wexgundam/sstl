package org.mose.util.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 涉及金额计算及展示的方法
 *
 * @author 靳磊
 * @date 2017年2月21日
 */
public class MoneyUtil {

    /**
     * 格式化金钱
     *
     * @param val
     * @return
     * @author 靳磊
     * @date 2017-05-23
     */
    public static String formatMoney(BigDecimal val) {
        NumberFormat nf = new DecimalFormat("#,###.##");
        String str = nf.format(val);
        return str;
    }

    /**
     * 由于报文传送中金额值为分,所以组报文的时候需要金额转换,元到分
     * 0.00 to 000
     *
     * @param amount 金额
     * @return String
     * @author 靳磊
     * @date 2017-05-23
     */
    public static BigDecimal moneyDToS(BigDecimal amount) {
        return BigDecimalUtil.mul(amount, new BigDecimal(100));
    }

    /**
     * 将报文中金额转成系统内用金额,分到元，保留两位小数
     * 000 to 0.00
     *
     * @param amount
     * @return BigDecimal
     * @author 靳磊
     * @date 2017-05-23
     */
    public static BigDecimal moneySToD(BigDecimal amount) {
        return BigDecimalUtil.div(amount, new BigDecimal(100));
    }

}
