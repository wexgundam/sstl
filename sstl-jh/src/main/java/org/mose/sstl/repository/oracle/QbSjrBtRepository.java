package org.mose.sstl.repository.oracle;

import org.mose.common.dao.stream.AbstractStreamRepository;
import org.mose.sstl.modal.QbSjrBt;
import org.mose.sstl.repository.IQbSjrBtRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
@Component
public class QbSjrBtRepository extends AbstractStreamRepository<QbSjrBt, Integer> implements IQbSjrBtRepository {
    @Override
    public List<QbSjrBt> queryManyByYxcc(String yxcc) {
        StringBuffer sql = new StringBuffer();
        sql.append("select rksj,sjly,bwbj,wjm,bzw,bzzlm,jtzlm,fcsj,fbsf,bzcc,yxcc,lcls,lczz,lczaz1,lczaz2, ");
        sql.append("lczoz,lchc,pbhj,zwts,fbzlm,zbz,jcz,bzzmc,jtzmc,fbzmc,jyzlm,jyzmc,zlfybj,zlbjsbj,lcbjsbj, ");
        sql.append("bwlx,sjbz,gksj,fjk,gkmc,cbbj,qdblsj,cxsj,blzlm,blzmc,jbcc,zbcbj,clyxcc,clbzcc,fbnyr,qbid, ");
        sql.append("sjbz2,jhddsj,dfbzlm,dfbzmc,lcbz,qbversion,zdversion ");
        sql.append("from qb_sjr_bt t ");
        sql.append("where t.yxcc=?");
        return query().sql(sql.toString()).parameters(yxcc).queryMany();
    }

}



