package ru.otus.example.cleancode.lesson4.bulky.models;

import java.time.LocalDate;
import java.util.UUID;

public class BankTransaction {

    private UUID transactionId;
    private LocalDate transactionDate;
    private boolean active;

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}