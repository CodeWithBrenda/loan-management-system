package com.brenda.loan_management_system.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Loan {
    private Long id;
    private String borrowerName;
    private BigDecimal amount;
    private Double interestRate;
    private LocalDate startDate;
    private LocalDate endDate;

    //Default value is active
    private String status = "Active";
}
