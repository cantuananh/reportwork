package com.reportwork.model;

import javax.persistence.*;

@Entity
@Table(name = "report_task")
public class ReportTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "business_report_id", nullable = false)
    private BusinessReport businessReport;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;
}


