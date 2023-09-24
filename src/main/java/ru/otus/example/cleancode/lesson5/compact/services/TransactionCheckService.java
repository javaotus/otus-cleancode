package ru.otus.example.cleancode.lesson5.compact.services;

import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.bulky.enums.OperationType;
import ru.otus.example.cleancode.lesson5.bulky.exceptions.LimitExceededException;

import java.math.BigDecimal;

public class TransactionCheckService {

    public boolean bankTransactionIsValid(BankTransactionDto bankTransactionDto, OperationType operationType) throws Exception {

        return operationType.equals(OperationType.DEPOSIT) ?
            checkAmountMatchesDefinedLimits(bankTransactionDto.getAmount(), bankTransactionDto.getMinimumLimitDeposit(), bankTransactionDto.getMaximumLimitDeposit(), operationType) :
            checkAmountMatchesDefinedLimits(bankTransactionDto.getAmount(), bankTransactionDto.getMinimumLimitWithdraw(), bankTransactionDto.getMaximumLimitWithdraw(), operationType);

    }

    private boolean checkAmountMatchesDefinedLimits(BigDecimal amount, BigDecimal firstLimit, BigDecimal secondLimit, OperationType operationType) throws Exception {

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

        return true;

    }

}