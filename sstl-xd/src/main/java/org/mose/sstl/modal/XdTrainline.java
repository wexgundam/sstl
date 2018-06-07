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
 * @author 靳磊 created on 2018/6/6
 */
public class XdTrainline {
    private String ddt;
    private Integer id;
    private Integer baseId;
    private String trainId;
    private String cc;
    private Integer sxx;
    private Integer trainkind;
    private Integer cz;
    private Integer linetype;
    private Integer currnode;
    private Integer zrSf;
    private Integer zcVx;
    private Integer sjt;
    private Date bTimestamp;
    private Date eTimestamp;
    private Date fTimestamp;
    private Integer currDd;
    private Integer howToEnd;
    private Integer endPoint;
    private String remark;
    private String jchm1;
    private String jchm2;

    private List<XdTrainTt> xdTrainTts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdTrainline that = (XdTrainline) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "XdTrainline{" +
                "ddt='" + ddt + '\'' +
                ", id=" + id +
                ", baseId=" + baseId +
                ", trainId='" + trainId + '\'' +
                ", cc='" + cc + '\'' +
                ", sxx=" + sxx +
                ", trainkind=" + trainkind +
                ", cz=" + cz +
                ", linetype=" + linetype +
                ", currnode=" + currnode +
                ", zrSf=" + zrSf +
                ", zcVx=" + zcVx +
                ", sjt=" + sjt +
                ", bTimestamp=" + bTimestamp +
                ", eTimestamp=" + eTimestamp +
                ", fTimestamp=" + fTimestamp +
                ", currDd=" + currDd +
                ", howToEnd=" + howToEnd +
                ", endPoint=" + endPoint +
                ", remark='" + remark + '\'' +
                ", jchm1='" + jchm1 + '\'' +
                ", jchm2='" + jchm2 + '\'' +
                '}';
    }

    public String getDdt() {
        return ddt;
    }

    public void setDdt(String ddt) {
        this.ddt = ddt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Integer getSxx() {
        return sxx;
    }

    public void setSxx(Integer sxx) {
        this.sxx = sxx;
    }

    public Integer getTrainkind() {
        return trainkind;
    }

    public void setTrainkind(Integer trainkind) {
        this.trainkind = trainkind;
    }

    public Integer getCz() {
        return cz;
    }

    public void setCz(Integer cz) {
        this.cz = cz;
    }

    public Integer getLinetype() {
        return linetype;
    }

    public void setLinetype(Integer linetype) {
        this.linetype = linetype;
    }

    public Integer getCurrnode() {
        return currnode;
    }

    public void setCurrnode(Integer currnode) {
        this.currnode = currnode;
    }

    public Integer getZrSf() {
        return zrSf;
    }

    public void setZrSf(Integer zrSf) {
        this.zrSf = zrSf;
    }

    public Integer getZcVx() {
        return zcVx;
    }

    public void setZcVx(Integer zcVx) {
        this.zcVx = zcVx;
    }

    public Integer getSjt() {
        return sjt;
    }

    public void setSjt(Integer sjt) {
        this.sjt = sjt;
    }

    public Date getbTimestamp() {
        return bTimestamp;
    }

    public void setbTimestamp(Date bTimestamp) {
        this.bTimestamp = bTimestamp;
    }

    public Date geteTimestamp() {
        return eTimestamp;
    }

    public void seteTimestamp(Date eTimestamp) {
        this.eTimestamp = eTimestamp;
    }

    public Date getfTimestamp() {
        return fTimestamp;
    }

    public void setfTimestamp(Date fTimestamp) {
        this.fTimestamp = fTimestamp;
    }

    public Integer getCurrDd() {
        return currDd;
    }

    public void setCurrDd(Integer currDd) {
        this.currDd = currDd;
    }

    public Integer getHowToEnd() {
        return howToEnd;
    }

    public void setHowToEnd(Integer howToEnd) {
        this.howToEnd = howToEnd;
    }

    public Integer getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Integer endPoint) {
        this.endPoint = endPoint;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public List<XdTrainTt> getXdTrainTts() {
        xdTrainTts = xdTrainTts == null ? new ArrayList<>() : xdTrainTts;
        return xdTrainTts;
    }

    public void setXdTrainTts(List<XdTrainTt> xdTrainTts) {
        this.xdTrainTts = xdTrainTts;
    }
}
