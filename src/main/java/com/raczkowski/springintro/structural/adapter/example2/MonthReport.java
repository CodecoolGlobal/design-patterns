package com.raczkowski.springintro.structural.adapter.example2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MonthReport {

    private final List<Duration> times;
    public Month month;
    private Map<Integer, Integer> daysToHoursMap;

    public MonthReport() {
        this.times = new ArrayList<>();
    }

    public Month getMonth() {
        return month;
    }

    public Map<Integer, Integer> getDaysToHoursMap() {
        return daysToHoursMap;
    }
}
