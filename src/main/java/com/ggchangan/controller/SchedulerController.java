package com.ggchangan.controller;

import com.ggchangan.quartz.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by magneto on 17-3-10.
 */
@Controller
public class SchedulerController {
    @Autowired
    SchedulerService schedulerService;

    @RequestMapping("/scheduler")
    @ResponseBody
    public void index(){
        schedulerService.submit();
    }
}
