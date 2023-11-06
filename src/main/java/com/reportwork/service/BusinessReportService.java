package com.reportwork.service;

import com.reportwork.model.BusinessReport;
import com.reportwork.repository.BusinessReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessReportService {
    private final BusinessReportRepository businessReportRepository;

    @Autowired
    public BusinessReportService(BusinessReportRepository businessReportRepository) {
        this.businessReportRepository = businessReportRepository;
    }

    public BusinessReport saveBusinessReport(BusinessReport businessReport) {
        return businessReportRepository.save(businessReport);
    }
}
