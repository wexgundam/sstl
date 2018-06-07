package org.mose.sstl.service;

import org.mose.sstl.modal.XdTrainTt;
import org.mose.sstl.modal.XdTrainline;
import org.mose.sstl.repository.IXdTrainTtRepository;
import org.mose.sstl.repository.IXdTrainlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
public class XdTrainlineService {
    /**
     * XdTrainline数据获取对象
     */
    @Autowired
    private IXdTrainlineRepository xdTrainlineRepository;

    /**
     * XdTrainTt数据获取对象
     */
    @Autowired
    private IXdTrainTtRepository xdTrainTtRepository;


    /**
     * what:    查询给定的时间，在给定的时间范围内到达给定车站的列车
     *
     * @param station
     * @param time
     * @param range
     *
     * @return
     */
    public List<XdTrainline> queryXdTrainlinesByStationTime(String station, Date time, int range) {
        return xdTrainlineRepository.queryManyByStationTime(station, time, range);
    }

    /**
     * what:    查询给定的时间，在给定的时间范围内到达给定车站的列车
     *
     * @param station
     * @param time
     * @param range
     *
     * @return
     */
    public List<XdTrainline> queryXdTrainlinesWithXdTrainTtsByStationTime(String station, Date time, int range) {
        List<XdTrainline> xdTrainlines = queryXdTrainlinesByStationTime(station, time, range);
        final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (final XdTrainline xdTrainline : xdTrainlines) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    List<XdTrainTt> xdTrainTts = xdTrainTtRepository.queryAllByXdTrainlineId(xdTrainline.getId());
                    xdTrainline.setXdTrainTts(xdTrainTts);
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
        return xdTrainlines;
    }


    public IXdTrainlineRepository getXdTrainlineRepository() {
        return xdTrainlineRepository;
    }

    public void setXdTrainlineRepository(IXdTrainlineRepository xdTrainlineRepository) {
        this.xdTrainlineRepository = xdTrainlineRepository;
    }

    public IXdTrainTtRepository getXdTrainTtRepository() {
        return xdTrainTtRepository;
    }

    public void setXdTrainTtRepository(IXdTrainTtRepository xdTrainTtRepository) {
        this.xdTrainTtRepository = xdTrainTtRepository;
    }
}
