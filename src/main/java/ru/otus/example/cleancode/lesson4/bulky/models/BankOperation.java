package ru.otus.example.cleancode.lesson4.bulky.models;

import ru.otus.example.cleancode.lesson4.bulky.models.enums.OperationType;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class BankOperation {

    private UUID operationId;

    private LocalDate operationDate;

    private BankData bankData;

    private List<BankTransaction> bankTransactions;

    private OperationType operationType;

    public UUID getOperationId() {
        return operationId;
    }

    public void setOperationId(UUID operationId) {
        this.operationId = operationId;
    }

    public LocalDate getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDate operationDate) {
        this.operationDate = operationDate;
    }

    public BankData getBankData() {
        return bankData;
    }

    public void setBankData(BankData bankData) {
        this.bankData = bankData;
    }

    public List<BankTransaction> getBankTransactions() {
        return bankTransactions;
    }

    public void setBankTransactions(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

}