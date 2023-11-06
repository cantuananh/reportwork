package com.reportwork.repository;

import com.reportwork.model.BusinessReport;
import com.reportwork.model.ReportTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BusinessReportRepository extends JpaRepository<BusinessReport, Integer> {
}
