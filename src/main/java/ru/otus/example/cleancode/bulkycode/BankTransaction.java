package ru.otus.example.cleancode.bulkycode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class BankTransaction extends AbstractBankTransaction {

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMinimumLimitDeposit() {
        return minimumLimitDeposit;
    }

    public void setMinimumLimitDeposit(BigDecimal minimumLimitDeposit) {
        this.minimumLimitDeposit = minimumLimitDeposit;
    }

    public BigDecimal getMaximumLimitDeposit() {
        return maximumLimitDeposit;
    }

    public void setMaximumLimitDeposit(BigDecimal maximumLimitDeposit) {
        this.maximumLimitDeposit = maximumLimitDeposit;
    }

    public BigDecimal getMinimumLimitWithdraw() {
        return minimumLimitWithdraw;
    }

    public void setMinimumLimitWithdraw(BigDecimal minimumLimitWithdraw) {
        this.minimumLimitWithdraw = minimumLimitWithdraw;
    }

    public BigDecimal getMaximumLimitWithdraw() {
        return maximumLimitWithdraw;
    }

    public void setMaximumLimitWithdraw(BigDecimal maximumLimitWithdraw) {
        this.maximumLimitWithdraw = maximumLimitWithdraw;
    }

    public BankTransactionType getBankTransactionType() {
        return bankTransactionType;
    }

    public void setBankTransactionType(BankTransactionType bankTransactionType) {
        this.bankTransactionType = bankTransactionType;
    }

}