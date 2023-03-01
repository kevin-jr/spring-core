package com.demo.service;

import com.demo.ds.Report;
import com.demo.format.ReportFormatter;
import com.demo.print.ReportPrinter;
import com.demo.repository.ReportRepository;
import org.springframework.stereotype.Service;

@Service
public class ComplexAction {


    private final ReportRepository reportRepository;


    private final ReportPrinter reportPrinter;


    private final ReportFormatter reportFormatter;


    public ComplexAction(ReportRepository reportRepository, ReportPrinter reportPrinter, ReportFormatter reportFormatter) {
        this.reportRepository = reportRepository;
        this.reportPrinter = reportPrinter;
        this.reportFormatter = reportFormatter;
    }

    public void reportAction() {

        reportPrinter.print(reportRepository.save(reportFormatter.format(new Report())));

    }
}
