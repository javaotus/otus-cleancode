package ru.otus.example.cleancode.bulkycode;

import java.util.UUID;

public class WithdrawTransaction extends AbstractBankTransaction {

    private UUID withdrawId;

    private String withdrawName;

    public UUID getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(UUID withdrawId) {
        this.withdrawId = withdrawId;
    }

    public String getWithdrawName() {
        return withdrawName;
    }

    public void setWithdrawName(String withdrawName) {
        this.withdrawName = withdrawName;
    }

}