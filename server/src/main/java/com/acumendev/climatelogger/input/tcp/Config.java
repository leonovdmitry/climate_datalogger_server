package com.acumendev.climatelogger.input.tcp;

import com.acumendev.climatelogger.input.tcp.handlers.SensorHandler;
import com.acumendev.climatelogger.protocol.BaseMessageOuterClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class Config {
    @Bean
    Map<String, SensorHandler<BaseMessageOuterClass.BaseMessage>> tcpSensorHandlers() {
        return new ConcurrentHashMap<>();
    }
}
