/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:sstl
 * Module Name:TODO:Module
 */
package org.mose.sstl.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * what:    (这里用一句话描述这个类的作用). <br/>
 * when:    (这里描述这个类的适用时机 – 可选).<br/>
 * how:     (这里描述这个类的使用方法 – 可选).<br/>
 * warning: (这里描述这个类的注意事项 – 可选).<br/>
 *
 * @author 靳磊 created on 2018/6/7
 */
public class QbSjrBt {
    private Date rksj;
    private String sjly;
    private String bwbjl;
    private String wjm;
    private String bzw;
    private String bzzlm;
    private String jtzlm;
    private Date fcsj;
    private String fbsf;
    private String bzcc;
    private String yxcc;
    private Integer lcls;
    private Integer lczz;
    private Integer lczaz1;
    private Integer lczaz2;
    private Integer lczoz;
    private String lchc;
    private Integer pbhj;
    private Integer zwts;
    private String fbzlm;
    private String zbz;
    private String jcz;
    private String bzzmc;
    private String jtzmc;
    private String fbzmc;
    private String jyzlm;
    private String jyzmc;
    private String zlfybj;
    private String zlbjsbj;
    private String lcbjsbj;
    private String bwlx;
    private String sjbz;
    private Date gksj;
    private String fjk;
    private String gkmc;
    private String cbbj;
    private Date qdblsj;
    private Date cxsj;
    private String blzlm;
    private String blzmc;
    private String jbcc;
    private String zbcbj;
    private String clyxcc;
    private String clbzcc;
    private String fbnyr;
    private String qbid;
    private String sjbz2;
    private Date jhddsj;
    private String dfbzlm;
    private String dfbzmc;
    private String lcbz;
    private String qbversion;
    private String zdversion;

    private List<QbSjrBw> qbSjrBws;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QbSjrBt qbSjrBt = (QbSjrBt) o;

        return rksj != null ? rksj.equals(qbSjrBt.rksj) : qbSjrBt.rksj == null;
    }

    @Override
    public int hashCode() {
        return rksj != null ? rksj.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "QbSjrBt{" +
                "rksj=" + rksj +
                ", sjly='" + sjly + '\'' +
                ", bwbjl='" + bwbjl + '\'' +
                ", wjm='" + wjm + '\'' +
                ", bzw='" + bzw + '\'' +
                ", bzzlm='" + bzzlm + '\'' +
                ", jtzlm='" + jtzlm + '\'' +
                ", fcsj=" + fcsj +
                ", fbsf='" + fbsf + '\'' +
                ", bzcc='" + bzcc + '\'' +
                ", yxcc='" + yxcc + '\'' +
                ", lcls=" + lcls +
                ", lczz=" + lczz +
                ", lczaz1=" + lczaz1 +
                ", lczaz2=" + lczaz2 +
                ", lczoz=" + lczoz +
                ", lchc='" + lchc + '\'' +
                ", pbhj=" + pbhj +
                ", zwts=" + zwts +
                ", fbzlm='" + fbzlm + '\'' +
                ", zbz='" + zbz + '\'' +
                ", jcz='" + jcz + '\'' +
                ", bzzmc='" + bzzmc + '\'' +
                ", jtzmc='" + jtzmc + '\'' +
                ", fbzmc='" + fbzmc + '\'' +
                ", jyzlm='" + jyzlm + '\'' +
                ", jyzmc='" + jyzmc + '\'' +
                ", zlfybj='" + zlfybj + '\'' +
                ", zlbjsbj='" + zlbjsbj + '\'' +
                ", lcbjsbj='" + lcbjsbj + '\'' +
                ", bwlx='" + bwlx + '\'' +
                ", sjbz='" + sjbz + '\'' +
                ", gksj=" + gksj +
                ", fjk='" + fjk + '\'' +
                ", gkmc='" + gkmc + '\'' +
                ", cbbj='" + cbbj + '\'' +
                ", qdblsj=" + qdblsj +
                ", cxsj=" + cxsj +
                ", blzlm='" + blzlm + '\'' +
                ", blzmc='" + blzmc + '\'' +
                ", jbcc='" + jbcc + '\'' +
                ", zbcbj='" + zbcbj + '\'' +
                ", clyxcc='" + clyxcc + '\'' +
                ", clbzcc='" + clbzcc + '\'' +
                ", fbnyr='" + fbnyr + '\'' +
                ", qbid='" + qbid + '\'' +
                ", sjbz2='" + sjbz2 + '\'' +
                ", jhddsj=" + jhddsj +
                ", dfbzlm='" + dfbzlm + '\'' +
                ", dfbzmc='" + dfbzmc + '\'' +
                ", lcbz='" + lcbz + '\'' +
                ", qbversion='" + qbversion + '\'' +
                ", zdversion='" + zdversion + '\'' +
                '}';
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public String getBwbjl() {
        return bwbjl;
    }

    public void setBwbjl(String bwbjl) {
        this.bwbjl = bwbjl;
    }

    public String getWjm() {
        return wjm;
    }

    public void setWjm(String wjm) {
        this.wjm = wjm;
    }

    public String getBzw() {
        return bzw;
    }

    public void setBzw(String bzw) {
        this.bzw = bzw;
    }

    public String getBzzlm() {
        return bzzlm;
    }

    public void setBzzlm(String bzzlm) {
        this.bzzlm = bzzlm;
    }

    public String getJtzlm() {
        return jtzlm;
    }

    public void setJtzlm(String jtzlm) {
        this.jtzlm = jtzlm;
    }

    public Date getFcsj() {
        return fcsj;
    }

    public void setFcsj(Date fcsj) {
        this.fcsj = fcsj;
    }

    public String getFbsf() {
        return fbsf;
    }

    public void setFbsf(String fbsf) {
        this.fbsf = fbsf;
    }

    public String getBzcc() {
        return bzcc;
    }

    public void setBzcc(String bzcc) {
        this.bzcc = bzcc;
    }

    public String getYxcc() {
        return yxcc;
    }

    public void setYxcc(String yxcc) {
        this.yxcc = yxcc;
    }

    public Integer getLcls() {
        return lcls;
    }

    public void setLcls(Integer lcls) {
        this.lcls = lcls;
    }

    public Integer getLczz() {
        return lczz;
    }

    public void setLczz(Integer lczz) {
        this.lczz = lczz;
    }

    public Integer getLczaz1() {
        return lczaz1;
    }

    public void setLczaz1(Integer lczaz1) {
        this.lczaz1 = lczaz1;
    }

    public Integer getLczaz2() {
        return lczaz2;
    }

    public void setLczaz2(Integer lczaz2) {
        this.lczaz2 = lczaz2;
    }

    public Integer getLczoz() {
        return lczoz;
    }

    public void setLczoz(Integer lczoz) {
        this.lczoz = lczoz;
    }

    public String getLchc() {
        return lchc;
    }

    public void setLchc(String lchc) {
        this.lchc = lchc;
    }

    public Integer getPbhj() {
        return pbhj;
    }

    public void setPbhj(Integer pbhj) {
        this.pbhj = pbhj;
    }

    public Integer getZwts() {
        return zwts;
    }

    public void setZwts(Integer zwts) {
        this.zwts = zwts;
    }

    public String getFbzlm() {
        return fbzlm;
    }

    public void setFbzlm(String fbzlm) {
        this.fbzlm = fbzlm;
    }

    public String getZbz() {
        return zbz;
    }

    public void setZbz(String zbz) {
        this.zbz = zbz;
    }

    public String getJcz() {
        return jcz;
    }

    public void setJcz(String jcz) {
        this.jcz = jcz;
    }

    public String getBzzmc() {
        return bzzmc;
    }

    public void setBzzmc(String bzzmc) {
        this.bzzmc = bzzmc;
    }

    public String getJtzmc() {
        return jtzmc;
    }

    public void setJtzmc(String jtzmc) {
        this.jtzmc = jtzmc;
    }

    public String getFbzmc() {
        return fbzmc;
    }

    public void setFbzmc(String fbzmc) {
        this.fbzmc = fbzmc;
    }

    public String getJyzlm() {
        return jyzlm;
    }

    public void setJyzlm(String jyzlm) {
        this.jyzlm = jyzlm;
    }

    public String getJyzmc() {
        return jyzmc;
    }

    public void setJyzmc(String jyzmc) {
        this.jyzmc = jyzmc;
    }

    public String getZlfybj() {
        return zlfybj;
    }

    public void setZlfybj(String zlfybj) {
        this.zlfybj = zlfybj;
    }

    public String getZlbjsbj() {
        return zlbjsbj;
    }

    public void setZlbjsbj(String zlbjsbj) {
        this.zlbjsbj = zlbjsbj;
    }

    public String getLcbjsbj() {
        return lcbjsbj;
    }

    public void setLcbjsbj(String lcbjsbj) {
        this.lcbjsbj = lcbjsbj;
    }

    public String getBwlx() {
        return bwlx;
    }

    public void setBwlx(String bwlx) {
        this.bwlx = bwlx;
    }

    public String getSjbz() {
        return sjbz;
    }

    public void setSjbz(String sjbz) {
        this.sjbz = sjbz;
    }

    public Date getGksj() {
        return gksj;
    }

    public void setGksj(Date gksj) {
        this.gksj = gksj;
    }

    public String getFjk() {
        return fjk;
    }

    public void setFjk(String fjk) {
        this.fjk = fjk;
    }

    public String getGkmc() {
        return gkmc;
    }

    public void setGkmc(String gkmc) {
        this.gkmc = gkmc;
    }

    public String getCbbj() {
        return cbbj;
    }

    public void setCbbj(String cbbj) {
        this.cbbj = cbbj;
    }

    public Date getQdblsj() {
        return qdblsj;
    }

    public void setQdblsj(Date qdblsj) {
        this.qdblsj = qdblsj;
    }

    public Date getCxsj() {
        return cxsj;
    }

    public void setCxsj(Date cxsj) {
        this.cxsj = cxsj;
    }

    public String getBlzlm() {
        return blzlm;
    }

    public void setBlzlm(String blzlm) {
        this.blzlm = blzlm;
    }

    public String getBlzmc() {
        return blzmc;
    }

    public void setBlzmc(String blzmc) {
        this.blzmc = blzmc;
    }

    public String getJbcc() {
        return jbcc;
    }

    public void setJbcc(String jbcc) {
        this.jbcc = jbcc;
    }

    public String getZbcbj() {
        return zbcbj;
    }

    public void setZbcbj(String zbcbj) {
        this.zbcbj = zbcbj;
    }

    public String getClyxcc() {
        return clyxcc;
    }

    public void setClyxcc(String clyxcc) {
        this.clyxcc = clyxcc;
    }

    public String getClbzcc() {
        return clbzcc;
    }

    public void setClbzcc(String clbzcc) {
        this.clbzcc = clbzcc;
    }

    public String getFbnyr() {
        return fbnyr;
    }

    public void setFbnyr(String fbnyr) {
        this.fbnyr = fbnyr;
    }

    public String getQbid() {
        return qbid;
    }

    public void setQbid(String qbid) {
        this.qbid = qbid;
    }

    public String getSjbz2() {
        return sjbz2;
    }

    public void setSjbz2(String sjbz2) {
        this.sjbz2 = sjbz2;
    }

    public Date getJhddsj() {
        return jhddsj;
    }

    public void setJhddsj(Date jhddsj) {
        this.jhddsj = jhddsj;
    }

    public String getDfbzlm() {
        return dfbzlm;
    }

    public void setDfbzlm(String dfbzlm) {
        this.dfbzlm = dfbzlm;
    }

    public String getDfbzmc() {
        return dfbzmc;
    }

    public void setDfbzmc(String dfbzmc) {
        this.dfbzmc = dfbzmc;
    }

    public String getLcbz() {
        return lcbz;
    }

    public void setLcbz(String lcbz) {
        this.lcbz = lcbz;
    }

    public String getQbversion() {
        return qbversion;
    }

    public void setQbversion(String qbversion) {
        this.qbversion = qbversion;
    }

    public String getZdversion() {
        return zdversion;
    }

    public void setZdversion(String zdversion) {
        this.zdversion = zdversion;
    }

    public List<QbSjrBw> getQbSjrBws() {
        qbSjrBws = qbSjrBws == null ? new ArrayList<>() : qbSjrBws;
        return qbSjrBws;
    }

    public void setQbSjrBws(List<QbSjrBw> qbSjrBws) {
        this.qbSjrBws = qbSjrBws;
    }
}
