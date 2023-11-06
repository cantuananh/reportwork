package com.reportwork.controller;

import com.reportwork.model.BusinessReport;
import com.reportwork.model.ReportFormDTO;
import com.reportwork.model.Task;
import com.reportwork.model.User;
import com.reportwork.service.BusinessReportService;
import com.reportwork.service.TaskService;
import com.reportwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("report")
public class ReportWorkController {
    private final TaskService taskService;
    private final BusinessReportService businessReportService;
    private final UserService userService;

    @Autowired
    public ReportWorkController(TaskService taskService, BusinessReportService businessReportService, UserService userService) {
        this.taskService = taskService;
        this.businessReportService = businessReportService;
        this.userService = userService;
    }

    @GetMapping()
    public String index() {
        return "/report-work/index";
    }

    @GetMapping("/show-form")
    public String showFormReport(Model model) {
        ReportFormDTO report = new ReportFormDTO();
        model.addAttribute("report", report);

        return "/report-work/form-report";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("report") ReportFormDTO reportDTO, RedirectAttributes redirectAttributes) {

        Task task = new Task();
        task.setTaskName(reportDTO.getTaskName());
        task.setProgressRate(reportDTO.getProgressRate());
        taskService.saveTask(task);

        BusinessReport businessReport = new BusinessReport();
        businessReport.setWorkingHours(reportDTO.getWorkingHours());
        businessReport.setClosingTime(reportDTO.getClosingTime());
        businessReport.setBehindTime(reportDTO.isIsBehindTime());
        businessReport.setLeavingEarly(reportDTO.isIsLeavingEarly());
        businessReport.setConditions(reportDTO.getConditions());
        businessReport.setImpressions(reportDTO.getImpressions());
        businessReport.setTomorrowSchedule(reportDTO.getTomorrowSchedule());

        businessReportService.saveBusinessReport(businessReport);

        redirectAttributes.addFlashAttribute("message", "Create report work successfully");

        return "redirect:/report";
    }

}
