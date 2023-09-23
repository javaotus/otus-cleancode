package ru.otus.example.cleancode.bulkycode;

import java.util.UUID;

public class DepositTransaction extends AbstractBankTransaction {

    private UUID depositId;

    private String depositName;

    public UUID getDepositId() {
        return depositId;
    }

    public void setDepositId(UUID depositId) {
        this.depositId = depositId;
    }

    public String getDepositName() {
        return depositName;
    }

    public void setDepositName(String depositName) {
        this.depositName = depositName;
    }

}