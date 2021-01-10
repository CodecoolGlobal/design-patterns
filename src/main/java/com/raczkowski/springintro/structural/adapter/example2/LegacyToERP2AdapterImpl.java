package com.raczkowski.springintro.structural.adapter.example2;

public class LegacyToERP2AdapterImpl implements LegacyToERP2Adapter {

    private ERPAccountancyBusinessSystem accountancyBusinessSystem;

    public LegacyToERP2AdapterImpl(ERPAccountancyBusinessSystem accountancyBusinessSystem) {
        this.accountancyBusinessSystem = accountancyBusinessSystem;
    }

    @Override
    public void submitTimeFor(Employee employee, MonthReport monthReport, Project project) {
        accountancyBusinessSystem.track_Time_For_Employee_In_Month(
                (double) employee.getId(),
                monthReport.getMonth().name(),
                monthReport.getDaysToHoursMap().values()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .toArray(),
                project.getTimeId(),
                String.valueOf(project.getProjectId()),
                project.getName(),
                Long.parseLong(project.getWGPD()),
                1
        );
    }
}
