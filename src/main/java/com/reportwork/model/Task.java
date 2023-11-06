package com.reportwork.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "progress_rate", nullable = false)
    private int progressRate;

    public Task() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task(String taskName, int progressRate) {
        this.taskName = taskName;
        this.progressRate = progressRate;
    }

    public Task(String taskName, int progressRate, User user) {
        this.taskName = taskName;
        this.progressRate = progressRate;
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = true)
    private User user;

}
