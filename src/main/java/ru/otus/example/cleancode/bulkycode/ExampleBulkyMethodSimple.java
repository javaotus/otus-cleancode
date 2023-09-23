package ru.otus.example.cleancode.bulkycode;

import ru.otus.example.cleancode.exceptions.LimitExceededException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class ExampleBulkyMethodSimple {

    public BankTransaction calculateExpense(BigDecimal amount, BigDecimal minLimDeposit, BigDecimal maxLimDeposit, BigDecimal minLimWithdraw, BigDecimal maxLimWithdraw, OperationType operationType) throws Exception {

        BankTransaction bankTransaction = new BankTransaction();

        bankTransaction.setTransactionId(UUID.randomUUID());
        bankTransaction.setActive(true);
        bankTransaction.setTransactionDate(LocalDate.now());
        bankTransaction.setTransactionName(UUID.randomUUID() + "_transaction");

        if (operationType.equals(OperationType.DEPOSIT)) {
            checkAmountMatchesDefinedLimits(amount, minLimDeposit, maxLimDeposit, operationType);
            bankTransaction.setBankTransactionType(BankTransactionType.DEBIT);
        } else {
            checkAmountMatchesDefinedLimits(amount, minLimWithdraw, maxLimWithdraw, operationType);
            bankTransaction.setBankTransactionType(BankTransactionType.CREDIT);
        }

        bankTransaction.setAmount(amount);

        return bankTransaction;

    }

    private void checkAmountMatchesDefinedLimits(BigDecimal amount, BigDecimal firstLimit, BigDecimal secondLimit, OperationType operationType) throws Exception {

        if (amount == null) {
            throw new Exception();
        }

        if (firstLimit == null && secondLimit == null) {
            throw new Exception();
        }

        if (amount.compareTo(firstLimit) < 0) {
            throw new LimitExceededException(String.format("Invalid amount. Minimum allowed %s is", operationType), firstLimit);
        }

        if (amount.compareTo(secondLimit) > 0) {
            throw new LimitExceededException(String.format("Invalid amount. Maximum allowed %s is", operationType), secondLimit);
        }

    }

}