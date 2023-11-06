package com.reportwork.model;

import java.util.Date;

public class ReportFormDTO {
    private String taskName;
    private int progressRate;

    public ReportFormDTO() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getProgressRate() {
        return progressRate;
    }

    public void setProgressRate(int progressRate) {
        this.progressRate = progressRate;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public String getTomorrowSchedule() {
        return tomorrowSchedule;
    }

    public void setTomorrowSchedule(String tomorrowSchedule) {
        this.tomorrowSchedule = tomorrowSchedule;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isIsBehindTime() {
        return isBehindTime;
    }

    public void setIsBehindTime(boolean isBehindTime) {
        this.isBehindTime = isBehindTime;
    }

    public String getBehindReason() {
        return behindReason;
    }

    public void setBehindReason(String behindReason) {
        this.behindReason = behindReason;
    }

    public boolean isIsLeavingEarly() {
        return isLeavingEarly;
    }

    public void setIsLeavingEarly(boolean leavingEarly) {
        isLeavingEarly = leavingEarly;
    }

    private String conditions;
    private String impressions;
    private String tomorrowSchedule;
    private Date date;
    private String workingHours;
    private String closingTime;
    private boolean isBehindTime;
    private String behindReason;
    private boolean isLeavingEarly;
}
