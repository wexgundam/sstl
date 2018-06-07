/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:
 * Module Name:TODO:Module
 */
package org.mose.sstl.xd.repository.oracle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mose.sstl.modal.XdTrainline;
import org.mose.sstl.repository.IXdTrainTtRepository;
import org.mose.sstl.repository.IXdTrainlineRepository;
import org.mose.util.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * what:    测试UserMysqlRepository.<br/>
 * when:    (这里描述这个类的适用时机 – 可选).<br/>
 * how:     (这里描述这个类的使用方法 – 可选).<br/>
 * warning: (这里描述这个类的注意事项 – 可选).<br/>
 *
 * @author 靳磊 created on 2017/12/2
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class TestOracleMysqlRepository {
    @Autowired
    private IXdTrainlineRepository xdTrainlineRepository;
    @Autowired
    private IXdTrainTtRepository xdTrainTtRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRepository() {
//        Date time = DateUtil.stringToDate("2017/10/24 16:55:00", "yyyy/MM/dd hh:mm:ss");
//        List<XdTrainline> xdTrainlines = xdTrainlineRepository.queryManyByStationTime("保德", time, 120);
//        Assert.assertNotNull(xdTrainlines);
        xdTrainTtRepository.queryAllByXdTrainlineId(1475232);
    }
}
