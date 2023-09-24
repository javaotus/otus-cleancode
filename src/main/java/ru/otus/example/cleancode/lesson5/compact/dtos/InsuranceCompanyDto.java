package ru.otus.example.cleancode.lesson5.compact.dtos;

import ru.otus.example.cleancode.lesson5.bulky.enums.BankTransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class InsuranceCompanyDto {

    private UUID transactionId;
    private UUID customerId;

    private String transactionName;
    private String paymentMethod;
    private String paymentWay;
    private String bankName;

    private LocalDate transactionDate;

    private boolean isActive;
    private boolean isAvailable;
    private boolean isCleared;

    private BigDecimal amount;

    private BigDecimal minimumLimitDeposit;
    private BigDecimal maximumLimitDeposit;

    private BigDecimal minimumLimitWithdraw;
    private BigDecimal maximumLimitWithdraw;

    private BankTransactionType bankTransactionType;

    private String sendingResult;

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isCleared() {
        return isCleared;
    }

    public void setCleared(boolean cleared) {
        isCleared = cleared;
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

    public String getSendingResult() {
        return sendingResult;
    }

    public void setSendingResult(String sendingResult) {
        this.sendingResult = sendingResult;
    }

}