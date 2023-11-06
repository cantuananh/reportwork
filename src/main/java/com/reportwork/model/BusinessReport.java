package com.reportwork.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "business_report")
public class BusinessReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "conditions")
    private String conditions;

    @Column(name = "impressions", columnDefinition = "TEXT")
    private String impressions;

    @Column(name = "tomorrow_schedule", columnDefinition = "TEXT")
    private String tomorrowSchedule;

    @Column(name = "date")
    private Date date;

    @Column(name = "working_hours")
    private String workingHours;

    @Column(name = "closing_time")
    private String closingTime;

    @Column(name = "is_behind_time")
    private boolean isBehindTime;

    @Column(name = "behind_reason", columnDefinition = "TEXT")
    private String behindReason;

    @Column(name = "is_leaving_early")
    private boolean isLeavingEarly;

    @ManyToOne
    @JoinColumn(name = "employee_code", nullable = true)
    private User user;

    public BusinessReport() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean isBehindTime() {
        return isBehindTime;
    }

    public void setBehindTime(boolean behindTime) {
        isBehindTime = behindTime;
    }

    public String getBehindReason() {
        return behindReason;
    }

    public void setBehindReason(String behindReason) {
        this.behindReason = behindReason;
    }

    public boolean isLeavingEarly() {
        return isLeavingEarly;
    }

    public void setLeavingEarly(boolean leavingEarly) {
        isLeavingEarly = leavingEarly;
    }

    public BusinessReport(String conditions, String impressions, String tomorrowSchedule, Date date, String workingHours, String closingTime, boolean isBehindTime, String behindReason, boolean isLeavingEarly) {
        this.conditions = conditions;
        this.impressions = impressions;
        this.tomorrowSchedule = tomorrowSchedule;
        this.workingHours = workingHours;
        this.closingTime = closingTime;
        this.isBehindTime = isBehindTime;
        this.isLeavingEarly = isLeavingEarly;
    }
}


