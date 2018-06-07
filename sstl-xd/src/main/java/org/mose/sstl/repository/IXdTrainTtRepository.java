package org.mose.sstl.repository;

import org.mose.sstl.modal.XdTrainTt;

import java.util.List;

/**
 * what:    XdTrainTt获取对象
 *
 * @Author: 靳磊
 * @Date: 2017/8/14:22
 */
public interface IXdTrainTtRepository {
    /**
     * what:    根据XdTrainline id查询
     *
     * @param id
     *
     * @return
     */
    List<XdTrainTt> queryAllByXdTrainlineId(int id);
}
