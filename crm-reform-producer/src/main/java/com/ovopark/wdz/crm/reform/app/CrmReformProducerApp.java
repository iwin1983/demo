package com.ovopark.wdz.crm.reform.app;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@ComponentScan(basePackages = {"com.ovopark.wdz.crm.reform" })
@EnableDubbo
@EnableScheduling
@DubboComponentScan(basePackages = "com.ovopark.wdz.crm.reform.service.dubbo.producer")
public class CrmReformProducerApp {

    protected final static Logger logger = LoggerFactory.getLogger(CrmReformProducerApp.class);

    public static void main(String[] args) throws Exception {
        System.setProperty("javax.xml.parsers.DocumentBuilderFactory","com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
        SpringApplication.run(CrmReformProducerApp.class, args);
        logger.info("crmReformProducerApp is success!");
    }
}