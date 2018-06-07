package org.mose.sstl.repository;

import org.mose.sstl.modal.QbSjrBt;

import java.util.List;

/**
 * what:    XdTrainline获取对象
 *
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
public interface IQbSjrBtRepository {
    List<QbSjrBt> queryManyByYxcc(String yxcc);
}
