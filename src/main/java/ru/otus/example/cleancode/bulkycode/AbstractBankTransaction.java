package ru.otus.example.cleancode.bulkycode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public abstract class AbstractBankTransaction {

    protected UUID transactionId;

    protected String transactionName;

    protected LocalDate transactionDate;

    protected boolean isActive;

    protected BigDecimal amount;

    protected BigDecimal minimumLimitDeposit;
    protected BigDecimal maximumLimitDeposit;

    protected BigDecimal minimumLimitWithdraw;
    protected BigDecimal maximumLimitWithdraw;

    protected BankTransactionType bankTransactionType;

}