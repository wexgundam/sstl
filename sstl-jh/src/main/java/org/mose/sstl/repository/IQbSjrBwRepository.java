package org.mose.sstl.repository;

import org.mose.sstl.modal.QbSjrBw;

import java.util.Date;
import java.util.List;

/**
 * what:    XdTrainTt获取对象
 *
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
public interface IQbSjrBwRepository {
    /**
     * what:    根据QbSjrBw rksj查询
     *
     * @param rksj
     *
     * @return
     */
    List<QbSjrBw> queryAllByQbSjrBtRksj(Date rksj);
}
