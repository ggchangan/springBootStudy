package com.ggchangan.quartz.job;

import com.ggchangan.quartz.service.SampleService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by magneto on 17-3-10.
 */
public class SampleJob implements Job {

    //@Autowired
    private SampleService service;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Hello .....................");
        //service.hello();
    }
}
