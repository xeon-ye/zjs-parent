package com.jlwb.framwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启用定时调度功能，Consul需要使用此功能来监控配置改变
 *
 * @author daxiong
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@ComponentScan({"com.jlwb.framwork","com.jlwb.push"})
@EnableConfigurationProperties({StudentConfig.class})
public class ConsulConfigDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigDemoApplication.class, args);
    }
}
