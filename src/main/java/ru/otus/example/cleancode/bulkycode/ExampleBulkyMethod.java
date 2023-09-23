package ru.otus.example.cleancode.bulkycode;

import ru.otus.example.cleancode.exceptions.LimitExceededException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class ExampleBulkyMethod {

    public BankTransaction calculateExpense(BigDecimal amount, BigDecimal minLimDeposit, BigDecimal maxLimDeposit, BigDecimal minLimWithdraw, BigDecimal maxLimWithdraw, OperationType operationType) throws Exception {

        BankTransaction bankTransaction = new BankTransaction();

        bankTransaction.setTransactionId(UUID.randomUUID());
        bankTransaction.setActive(true);
        bankTransaction.setTransactionDate(LocalDate.now());
        bankTransaction.setTransactionName(UUID.randomUUID() + "_transaction");

        if (operationType.equals(OperationType.DEPOSIT)) {

            if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {

                if (minLimDeposit == null || maxLimDeposit == null) {
                    throw new Exception();
                }

                if (amount.compareTo(minLimDeposit) < 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Minimum allowed %s is", operationType), minLimDeposit);
                }

                if (amount.compareTo(maxLimDeposit) > 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Maximum allowed %s is", operationType), maxLimDeposit);
                }

                bankTransaction.setAmount(amount);
                bankTransaction.setBankTransactionType(BankTransactionType.DEBIT);

            }
        }

        if (operationType.equals(OperationType.WITHDRAW)) {

            if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {

                if (minLimWithdraw == null || maxLimWithdraw == null) {
                    throw new Exception();
                }

                if (amount.compareTo(minLimWithdraw) < 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Minimum allowed %s is", operationType), minLimWithdraw);
                }

                if (amount.compareTo(maxLimWithdraw) > 0) {
                    throw new LimitExceededException(String.format("Invalid amount. Maximum allowed %s is", operationType), minLimWithdraw);
                }

                bankTransaction.setAmount(amount);
                bankTransaction.setBankTransactionType(BankTransactionType.CREDIT);

            }
        }

        return bankTransaction;

    }

}