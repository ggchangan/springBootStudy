package com.ggchangan.quartz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by david on 2015-01-20.
 */
@Configuration
//@ConditionalOnProperty(name = "quartz.enabled")
@ComponentScan("com.ggchangan.quartz")
public class SchedulerConfig {
    /*
    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob().ofType(SampleJob.class)
            .storeDurably()
            .withIdentity("Qrtz_Job_Detail")
            .withDescription("Invoke Sample Job service...")
            .build();
    }

    @Bean
    public Trigger trigger() {
        return TriggerBuilder.newTrigger().forJob(jobDetail())
            .withIdentity("Qrtz_Trigger")
            .withDescription("Sample trigger")
            .withSchedule(simpleSchedule().repeatForever().withIntervalInMilliseconds(10))
            .build();
    }

    @Bean
    public Scheduler scheduler() {
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = null;
        try {
            factory.initialize(new ClassPathResource("quartz.properties").getInputStream());
            scheduler = factory.getScheduler();
            scheduler.scheduleJob(jobDetail(), trigger());
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return scheduler;
    }
    */
}
