package org.mose.sstl.repository.oracle;

import org.mose.common.dao.stream.AbstractStreamRepository;
import org.mose.sstl.modal.QbSjrBw;
import org.mose.sstl.repository.IQbSjrBwRepository;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
@Component
public class QbSjrBwRepository extends AbstractStreamRepository<QbSjrBw, Integer> implements IQbSjrBwRepository {
    @Override
    public List<QbSjrBw> queryAllByQbSjrBtRksj(Date rksj) {
        StringBuffer sql = new StringBuffer();
        sql.append("select ");
        sql.append("rksj,sx,czcx,gcyz,ch,zz,hc,zazbz,zaz,dydzlm,zzdzlm,hwmc,shr,fzlm,pbs,js,czdm, ");
        sql.append("xdm1,xz1,xk1,xdm2,xz2,xk2,czkbj,dydzmc,zzdzmc,fzmc,djdm,dfjdm,fxh,fyydm, ");
        sql.append("lqdm,bjsbj,clbxh,zxh,jszm,cbszlm,cbzzlm,cblc,cbqjdm,cwsm,sjbz,qbid,zlbz, ");
        sql.append("jybz,hsbz,yfbz,sfh,hpid,qtbz,fyym,czgsdm ");
        sql.append("from qb_sjr_bw where rksj=? order by sx");
        return query().sql(sql.toString()).parameters(rksj).queryMany();
    }
}





