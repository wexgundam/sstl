package org.mose.sstl.repository;

import org.mose.sstl.modal.XdTrainline;

import java.util.Date;
import java.util.List;

/**
 * what:    XdTrainline获取对象
 *
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
public interface IXdTrainlineRepository {
    List<XdTrainline> queryManyByStationTime(String station, Date time, int range);
}
