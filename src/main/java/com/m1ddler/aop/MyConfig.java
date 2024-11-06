package com.m1ddler.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.m1ddler.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
