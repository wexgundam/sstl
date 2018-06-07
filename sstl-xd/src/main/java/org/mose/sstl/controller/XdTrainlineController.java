package org.mose.sstl.controller;

import org.mose.sstl.modal.XdTrainline;
import org.mose.sstl.service.XdTrainlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * what:    用户控制器
 *
 * @Author: 靳磊
 * @Date: 2017/8/18 14:52
 */
@RestController
@RequestMapping("/sstl/xd")
public class XdTrainlineController {
    /**
     * 用户服务
     */
    @Autowired
    private XdTrainlineService xdTrainlineService;

    /**
     * what:    展示场景index视图
     *
     * @return
     */
    @RequestMapping("/xdtrainlines")
    public List<XdTrainline> userIndexView(String station, Date time, int timeRange) {
        List<XdTrainline> xdTrainlines = xdTrainlineService.queryXdTrainlinesWithXdTrainTtsByStationTime(station, time, timeRange);
        return xdTrainlines;
    }

    public XdTrainlineService getXdTrainlineService() {
        return xdTrainlineService;
    }

    public void setXdTrainlineService(XdTrainlineService xdTrainlineService) {
        this.xdTrainlineService = xdTrainlineService;
    }
}
