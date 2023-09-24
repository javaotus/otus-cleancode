package ru.otus.example.cleancode.lesson4.bulky.models;

import java.time.LocalDate;
import java.util.UUID;

public class BankData {

    private UUID bankId;
    private String bankName;
    private LocalDate foundationDate;

    private BankAddress bankAddress;

    public UUID getBankId() {
        return bankId;
    }

    public void setBankId(UUID bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public BankAddress getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(BankAddress bankAddress) {
        this.bankAddress = bankAddress;
    }

}