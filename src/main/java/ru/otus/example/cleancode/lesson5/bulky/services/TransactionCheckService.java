package ru.otus.example.cleancode.lesson5.bulky.services;

import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.bulky.enums.OperationType;
import ru.otus.example.cleancode.lesson5.bulky.exceptions.LimitExceededException;

import java.math.BigDecimal;

public class TransactionCheckService {

    public boolean bankTransactionIsValid(BankTransactionDto bankTransactionDto, OperationType operationType) throws Exception {

        boolean transactionIsValid = true;

        if (operationType.equals(OperationType.DEPOSIT)) {

            if (bankTransactionDto.getAmount() != null && bankTransactionDto.getAmount().compareTo(BigDecimal.ZERO) > 0) {
                if (bankTransactionDto.getMinimumLimitDeposit() == null || bankTransactionDto.getMaximumLimitDeposit() == null) {
                    throw new Exception();
                }

                if (bankTransactionDto.getAmount().compareTo(bankTransactionDto.getMinimumLimitDeposit()) < 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Minimum allowed %s is", operationType), bankTransactionDto.getMinimumLimitDeposit());
                }

                if (bankTransactionDto.getAmount().compareTo(bankTransactionDto.getMaximumLimitDeposit()) > 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Maximum allowed %s is", operationType), bankTransactionDto.getMaximumLimitDeposit());
                }
            }
        }

        if (operationType.equals(OperationType.WITHDRAW)) {

            if (bankTransactionDto.getAmount() != null && bankTransactionDto.getAmount().compareTo(BigDecimal.ZERO) > 0) {

                if (bankTransactionDto.getMinimumLimitWithdraw() == null || bankTransactionDto.getMaximumLimitDeposit() == null) {
                    throw new Exception();
                }

                if (bankTransactionDto.getAmount().compareTo(bankTransactionDto.getMinimumLimitWithdraw()) < 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Minimum allowed %s is", operationType), bankTransactionDto.getMinimumLimitWithdraw());
                }

                if (bankTransactionDto.getAmount().compareTo(bankTransactionDto.getMaximumLimitWithdraw()) > 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Maximum allowed %s is", operationType), bankTransactionDto.getMinimumLimitWithdraw());
                }

            }
        }

        return transactionIsValid;
    }

}
