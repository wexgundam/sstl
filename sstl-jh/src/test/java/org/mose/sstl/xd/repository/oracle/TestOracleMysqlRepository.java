/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:
 * Module Name:TODO:Module
 */
package org.mose.sstl.xd.repository.oracle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mose.sstl.modal.QbSjrBt;
import org.mose.sstl.modal.QbSjrBw;
import org.mose.sstl.repository.IQbSjrBwRepository;
import org.mose.sstl.repository.IQbSjrBtRepository;
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
    private IQbSjrBtRepository qbSjrBtRepository;
    @Autowired
    private IQbSjrBwRepository qbSjrBwRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRepository() {
        List<QbSjrBt> qbSjrBts = qbSjrBtRepository.queryManyByYxcc("3456789");
        Assert.assertNotNull(qbSjrBts);
        Date time = DateUtil.stringToDate("2004/6/18 16:01:36", "yyyy/MM/dd hh:mm:ss");
        List<QbSjrBw> qbSjrBws = qbSjrBwRepository.queryAllByQbSjrBtRksj(time);
        Assert.assertNotNull(qbSjrBws);
    }
}
