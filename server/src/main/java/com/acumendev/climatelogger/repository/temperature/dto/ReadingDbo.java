package com.acumendev.climatelogger.repository.temperature.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReadingDbo {
    private final float value;
    private final long timeStamp;
    private long userId;
    private long sensorId;
}
