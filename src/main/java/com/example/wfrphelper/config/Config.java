package com.example.wfrphelper.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.wfrphelper.model")
@EnableAspectJAutoProxy
public class Config {

}
