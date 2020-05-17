package com.shenhangyu.ieurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务器启动
 * 
 * @author moshenghang
 * @date 2020年5月11日
 */
@EnableEurekaServer
@SpringBootApplication
public class IEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(IEurekaServerApplication.class, args);
	}
}
