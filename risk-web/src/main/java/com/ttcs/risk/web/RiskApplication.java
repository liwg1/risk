package com.ttcs.risk.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author liwg
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RiskApplication {

    private static final Logger log = LoggerFactory.getLogger(RiskApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RiskApplication.class, args);
        log.info("(♥◠‿◠♥)  风控系统启动成功  (♥◠‿◠♥)");
    }
}
