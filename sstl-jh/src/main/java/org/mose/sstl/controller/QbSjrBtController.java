package org.mose.sstl.controller;

import org.mose.sstl.modal.QbSjrBt;
import org.mose.sstl.service.QbSjrBtService;
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
@RequestMapping("/sstl/jh")
public class QbSjrBtController {
    /**
     * 用户服务
     */
    @Autowired
    private QbSjrBtService qbSjrBtService;

    /**
     * what:    展示场景index视图
     *
     * @return
     */
    @RequestMapping("/qbsjrbts")
    public List<QbSjrBt> userIndexView(String yxcc) {
        List<QbSjrBt> qbSjrBts = qbSjrBtService.queryQbSjrBtsByYxcc(yxcc);
        return qbSjrBts;
    }

    public QbSjrBtService getQbSjrBtService() {
        return qbSjrBtService;
    }

    public void setQbSjrBtService(QbSjrBtService qbSjrBtService) {
        this.qbSjrBtService = qbSjrBtService;
    }
}
