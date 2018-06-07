package org.mose.sstl.repository.oracle;

import org.mose.common.dao.stream.AbstractStreamRepository;
import org.mose.sstl.modal.XdTrainline;
import org.mose.sstl.repository.IXdTrainlineRepository;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
@Component
public class XdTrainlineOracleRepository extends AbstractStreamRepository<XdTrainline, Integer> implements IXdTrainlineRepository {
    @Override
    public List<XdTrainline> queryManyByStationTime(String station, Date time, int rangeSecond) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.add(Calendar.SECOND, -rangeSecond);
        Date sourceTime = calendar.getTime();
        StringBuffer sql = new StringBuffer();
        sql.append("select t1.id from xd_trainline t1 ");
        sql.append("where t1.id in(");
        sql.append("select t.id from xd_train_tt t ");
        sql.append("where t.node=? ");
        sql.append("and t.ddsj ");
        sql.append(" between ? and ? ");
        sql.append(")");
        return query().sql(sql.toString()).parameters(station, sourceTime, time).queryMany();
    }
}
