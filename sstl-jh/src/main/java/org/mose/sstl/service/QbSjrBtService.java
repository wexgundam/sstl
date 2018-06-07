package org.mose.sstl.service;

import org.mose.sstl.modal.QbSjrBt;
import org.mose.sstl.modal.QbSjrBw;
import org.mose.sstl.repository.IQbSjrBtRepository;
import org.mose.sstl.repository.IQbSjrBwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * what:    XdTrainline服务
 *
 * @Author: 靳磊
 * @Date: 2017/8/18 14:43
 */
@Service
public class QbSjrBtService {
    /**
     * QbSjrBt数据获取对象
     */
    @Autowired
    private IQbSjrBtRepository qbSjrBtRepository;

    /**
     * QbSjrBw数据获取对象
     */
    @Autowired
    private IQbSjrBwRepository qbSjrBwRepository;

    /**
     * what:
     *
     * @return
     */
    public List<QbSjrBt> queryQbSjrBtsByYxcc(String ycxx) {
        List<QbSjrBt> qbSjrBts = qbSjrBtRepository.queryManyByYxcc(ycxx);
        final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (final QbSjrBt qbSjrBt : qbSjrBts) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    List<QbSjrBw> qbSjrBts = qbSjrBwRepository.queryAllByQbSjrBtRksj(qbSjrBt.getRksj());
                    qbSjrBt.setQbSjrBws(qbSjrBts);
                }
            });
        }

        threadPoolExecutor.shutdown();

        try {
            while (!threadPoolExecutor.awaitTermination(100, TimeUnit.MILLISECONDS)) {
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return qbSjrBts;
    }

    public IQbSjrBtRepository getQbSjrBtRepository() {
        return qbSjrBtRepository;
    }

    public void setQbSjrBtRepository(IQbSjrBtRepository qbSjrBtRepository) {
        this.qbSjrBtRepository = qbSjrBtRepository;
    }

    public IQbSjrBwRepository getQbSjrBwRepository() {
        return qbSjrBwRepository;
    }

    public void setQbSjrBwRepository(IQbSjrBwRepository qbSjrBwRepository) {
        this.qbSjrBwRepository = qbSjrBwRepository;
    }
}
