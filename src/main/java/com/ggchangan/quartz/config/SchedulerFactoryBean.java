package com.ggchangan.quartz.config;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by magneto on 17-3-10.
 */

@Component
public class SchedulerFactoryBean implements FactoryBean<Scheduler> {

    @Override
    public Scheduler getObject() throws Exception {
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        factory.initialize(new ClassPathResource("quartz.properties").getInputStream());
        return scheduler;
    }

    @Override public Class<?> getObjectType() {
        return Scheduler.class;
    }

    @Override public boolean isSingleton() {
        return true;
    }
}
