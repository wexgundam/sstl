/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:sstl
 * Module Name:TODO:Module
 */
package org.mose.sstl.modal;

import java.util.Date;

/**
 * what:    (这里用一句话描述这个类的作用). <br/>
 * when:    (这里描述这个类的适用时机 – 可选).<br/>
 * how:     (这里描述这个类的使用方法 – 可选).<br/>
 * warning: (这里描述这个类的注意事项 – 可选).<br/>
 *
 * @author 靳磊 created on 2018/6/6
 */
public class XdTrainTt {
    private Integer id;
    private Integer zx;
    private String node;
    private Integer nodeCode;
    private Integer xbid;
    private Integer zqjid;
    private Integer gdh;
    private Date ddsj;
    private Date cfsj;
    private String ddcc;
    private String cfcc;
    private Integer dfdFalg;
    private Date tdddsj;
    private Date tdcfsj;
    private Integer qjTkBj;
    private Date sfsj;
    private Date tcsj;
    private Date kcsj;
    private Date fhsj;
    private String xcxx;
    private Integer jwtcsj;
    private Integer sjt;
    private Integer sjqjtk;
    private Integer preLineid;
    private Integer nextLineid;
    private Integer zwdbj;
    private Integer yysj;
    private String jchm1;
    private String jchm2;
    private Integer zzl;
    private Integer zhc;
    private Integer zls;
    private Integer cxcbj;
    private Integer bbFlag;
    private Integer bjFlag;
    private Integer sgFlag;
    private Integer markFlag;
    private Integer timermd;
    private Integer iskeepsecret;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdTrainTt xdTrainTt = (XdTrainTt) o;

        if (getId() != xdTrainTt.getId()) return false;
        return getZx() == xdTrainTt.getZx();
    }

    @Override
    public int hashCode() {
        Integer result = getId();
        result = 31 * result + getZx();
        return result;
    }

    @Override
    public String toString() {
        return "XdTrainTt{" +
                "id=" + id +
                ", zx=" + zx +
                ", node='" + node + '\'' +
                ", nodeCode=" + nodeCode +
                ", xbid=" + xbid +
                ", zqjid=" + zqjid +
                ", gdh=" + gdh +
                ", ddsj=" + ddsj +
                ", cfsj=" + cfsj +
                ", ddcc='" + ddcc + '\'' +
                ", cfcc='" + cfcc + '\'' +
                ", dfdFalg=" + dfdFalg +
                ", tdddsj=" + tdddsj +
                ", tdcfsj=" + tdcfsj +
                ", qjTkBj=" + qjTkBj +
                ", sfsj=" + sfsj +
                ", tcsj=" + tcsj +
                ", kcsj=" + kcsj +
                ", fhsj=" + fhsj +
                ", xcxx='" + xcxx + '\'' +
                ", jwtcsj=" + jwtcsj +
                ", sjt=" + sjt +
                ", sjqjtk=" + sjqjtk +
                ", preLineid=" + preLineid +
                ", nextLineid=" + nextLineid +
                ", zwdbj=" + zwdbj +
                ", yysj=" + yysj +
                ", jchm1=" + jchm1 +
                ", jchm2='" + jchm2 + '\'' +
                ", zzl=" + zzl +
                ", zhc=" + zhc +
                ", zls=" + zls +
                ", cxcbj=" + cxcbj +
                ", bbFlag=" + bbFlag +
                ", bjFlag=" + bjFlag +
                ", sgFlag=" + sgFlag +
                ", markFlag=" + markFlag +
                ", timermd=" + timermd +
                ", iskeepsecret=" + iskeepsecret +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZx() {
        return zx;
    }

    public void setZx(Integer zx) {
        this.zx = zx;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Integer getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(Integer nodeCode) {
        this.nodeCode = nodeCode;
    }

    public Integer getXbid() {
        return xbid;
    }

    public void setXbid(Integer xbid) {
        this.xbid = xbid;
    }

    public Integer getZqjid() {
        return zqjid;
    }

    public void setZqjid(Integer zqjid) {
        this.zqjid = zqjid;
    }

    public Integer getGdh() {
        return gdh;
    }

    public void setGdh(Integer gdh) {
        this.gdh = gdh;
    }

    public Date getDdsj() {
        return ddsj;
    }

    public void setDdsj(Date ddsj) {
        this.ddsj = ddsj;
    }

    public Date getCfsj() {
        return cfsj;
    }

    public void setCfsj(Date cfsj) {
        this.cfsj = cfsj;
    }

    public String getDdcc() {
        return ddcc;
    }

    public void setDdcc(String ddcc) {
        this.ddcc = ddcc;
    }

    public String getCfcc() {
        return cfcc;
    }

    public void setCfcc(String cfcc) {
        this.cfcc = cfcc;
    }

    public Integer getDfdFalg() {
        return dfdFalg;
    }

    public void setDfdFalg(Integer dfdFalg) {
        this.dfdFalg = dfdFalg;
    }

    public Date getTdddsj() {
        return tdddsj;
    }

    public void setTdddsj(Date tdddsj) {
        this.tdddsj = tdddsj;
    }

    public Date getTdcfsj() {
        return tdcfsj;
    }

    public void setTdcfsj(Date tdcfsj) {
        this.tdcfsj = tdcfsj;
    }

    public Integer getQjTkBj() {
        return qjTkBj;
    }

    public void setQjTkBj(Integer qjTkBj) {
        this.qjTkBj = qjTkBj;
    }

    public Date getSfsj() {
        return sfsj;
    }

    public void setSfsj(Date sfsj) {
        this.sfsj = sfsj;
    }

    public Date getTcsj() {
        return tcsj;
    }

    public void setTcsj(Date tcsj) {
        this.tcsj = tcsj;
    }

    public Date getKcsj() {
        return kcsj;
    }

    public void setKcsj(Date kcsj) {
        this.kcsj = kcsj;
    }

    public Date getFhsj() {
        return fhsj;
    }

    public void setFhsj(Date fhsj) {
        this.fhsj = fhsj;
    }

    public String getXcxx() {
        return xcxx;
    }

    public void setXcxx(String xcxx) {
        this.xcxx = xcxx;
    }

    public Integer getJwtcsj() {
        return jwtcsj;
    }

    public void setJwtcsj(Integer jwtcsj) {
        this.jwtcsj = jwtcsj;
    }

    public Integer getSjt() {
        return sjt;
    }

    public void setSjt(Integer sjt) {
        this.sjt = sjt;
    }

    public Integer getSjqjtk() {
        return sjqjtk;
    }

    public void setSjqjtk(Integer sjqjtk) {
        this.sjqjtk = sjqjtk;
    }

    public Integer getPreLineid() {
        return preLineid;
    }

    public void setPreLineid(Integer preLineid) {
        this.preLineid = preLineid;
    }

    public Integer getNextLineid() {
        return nextLineid;
    }

    public void setNextLineid(Integer nextLineid) {
        this.nextLineid = nextLineid;
    }

    public Integer getZwdbj() {
        return zwdbj;
    }

    public void setZwdbj(Integer zwdbj) {
        this.zwdbj = zwdbj;
    }

    public Integer getYysj() {
        return yysj;
    }

    public void setYysj(Integer yysj) {
        this.yysj = yysj;
    }

    public String getJchm1() {
        return jchm1;
    }

    public void setJchm1(String jchm1) {
        this.jchm1 = jchm1;
    }

    public String getJchm2() {
        return jchm2;
    }

    public void setJchm2(String jchm2) {
        this.jchm2 = jchm2;
    }

    public Integer getZzl() {
        return zzl;
    }

    public void setZzl(Integer zzl) {
        this.zzl = zzl;
    }

    public Integer getZhc() {
        return zhc;
    }

    public void setZhc(Integer zhc) {
        this.zhc = zhc;
    }

    public Integer getZls() {
        return zls;
    }

    public void setZls(Integer zls) {
        this.zls = zls;
    }

    public Integer getCxcbj() {
        return cxcbj;
    }

    public void setCxcbj(Integer cxcbj) {
        this.cxcbj = cxcbj;
    }

    public Integer getBbFlag() {
        return bbFlag;
    }

    public void setBbFlag(Integer bbFlag) {
        this.bbFlag = bbFlag;
    }

    public Integer getBjFlag() {
        return bjFlag;
    }

    public void setBjFlag(Integer bjFlag) {
        this.bjFlag = bjFlag;
    }

    public Integer getSgFlag() {
        return sgFlag;
    }

    public void setSgFlag(Integer sgFlag) {
        this.sgFlag = sgFlag;
    }

    public Integer getMarkFlag() {
        return markFlag;
    }

    public void setMarkFlag(Integer markFlag) {
        this.markFlag = markFlag;
    }

    public Integer getTimermd() {
        return timermd;
    }

    public void setTimermd(Integer timermd) {
        this.timermd = timermd;
    }

    public Integer getIskeepsecret() {
        return iskeepsecret;
    }

    public void setIskeepsecret(Integer iskeepsecret) {
        this.iskeepsecret = iskeepsecret;
    }
}
