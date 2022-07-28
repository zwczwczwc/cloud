package com.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author zwc
 * 2022-07-28
 * 9:38
 */
public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC; // 日志级别为BASIC
    }
}
