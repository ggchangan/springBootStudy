package com.ggchangan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by magneto on 17-3-6.
 */
public class MyBatisConfig {
    @Autowired
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        // sessionFactory.setPlugins(new Interceptor[]{new PageInterceptor()});
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath*:mapper/*.xml"));
        return sessionFactory;
    }
}