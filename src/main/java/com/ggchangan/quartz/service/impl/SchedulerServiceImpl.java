package com.ggchangan.quartz.service.impl;

import com.ggchangan.quartz.job.SampleJob;
import com.ggchangan.quartz.service.SchedulerService;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

/**
 * Created by magneto on 17-3-10.
 */
@Service
public class SchedulerServiceImpl implements SchedulerService{

    @Autowired
    private Scheduler scheduler;

    @Override
    public void submit() {

        JobDetail jobDetail = JobBuilder.newJob().ofType(SampleJob.class).storeDurably()
            .withIdentity("Qrtz_Job_Detail").withDescription("Invoke Sample Job service...")
            .build();

        SimpleTrigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail).withIdentity("Qrtz_Trigger")
            .withDescription("Sample trigger")
            .withSchedule(simpleSchedule().repeatForever().withIntervalInMilliseconds(10)).build();

        try {
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
