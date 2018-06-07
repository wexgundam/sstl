package org.mose.sstl.repository.oracle;

import org.mose.common.dao.stream.AbstractStreamRepository;
import org.mose.sstl.modal.XdTrainTt;
import org.mose.sstl.repository.IXdTrainTtRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
@Component
public class XdTrainTtOracleRepository extends AbstractStreamRepository<XdTrainTt, Integer> implements IXdTrainTtRepository {
    @Override
    public List<XdTrainTt> queryAllByXdTrainlineId(int id) {
        StringBuffer sql = new StringBuffer();
        sql.append("select ");
        sql.append("id, zx, node, node_code, xbid, zqjid, gdh, ddsj, cfsj, ddcc, cfcc, dfd_falg, ");
        sql.append("tdddsj, tdcfsj, qj_tk_bj, sfsj, tcsj, kcsj, fhsj, xcxx, jwtcsj, sjt, sjqjtk, ");
        sql.append("pre_lineid, next_lineid, zwdbj, yysj, jchm1, jchm2, zzl, zhc, zls, cxcbj, ");
        sql.append("bb_flag, bj_flag, sg_flag, mark_flag, timermd, iskeepsecret ");
        sql.append("from xd_train_tt t where t.id=? order by t.zx");
        return query().sql(sql.toString()).parameters(id).queryMany();
    }
}
