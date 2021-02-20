package com.AlbertAbuav.demo3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.AlbertAbuav.demo3")
@PropertySource(value = "classpath:Person-Info.properties")
public class MyConfiguration {
}
