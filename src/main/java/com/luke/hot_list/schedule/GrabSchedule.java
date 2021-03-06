package com.luke.hot_list.schedule;

import com.luke.hot_list.service.DataService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author luke_long
 * @version 1.0
 * @date 2021/12/27 11:31
 */
@Component
@EnableScheduling
public class GrabSchedule {

    @Resource
    DataService dataService;

//    @Scheduled(cron = "* */15 * * * ?")
    public void grabZhihu() {
        dataService.grabZhihu();
    }

//    @Scheduled(cron = "0 35 */1 * * ?")
    public void grabHotList(){
        dataService.grabHotList();
    }

//    @Scheduled(cron = "0 5 0 * * ?")
    public void cleanOldData() {
        dataService.cleanOldData();
    }
}
