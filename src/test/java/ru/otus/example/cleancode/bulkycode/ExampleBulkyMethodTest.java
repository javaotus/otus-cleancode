package ru.otus.example.cleancode.bulkycode;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class ExampleBulkyMethodTest {

    @Test
    public void testNumberOne() throws Exception {

        ExampleBulkyMethod exampleBulkyMethod = new ExampleBulkyMethod();

        BankTransaction bankTransactionExpected = new BankTransaction();
        bankTransactionExpected.setAmount(BigDecimal.valueOf(100.00));

        BankTransaction bankTransaction = exampleBulkyMethod.calculateExpense(
            BigDecimal.valueOf(100.00),
            BigDecimal.valueOf(10.00),
            BigDecimal.valueOf(120.00),
            BigDecimal.valueOf(10.00),
            BigDecimal.valueOf(20.00),
            OperationType.DEPOSIT
        );

        assertEquals(bankTransaction.getAmount(), bankTransactionExpected.getAmount());

    }

    @Test
    public void testNumberTwo() throws Exception {

        ExampleBulkyMethod exampleBulkyMethod = new ExampleBulkyMethod();

        BankTransaction bankTransactionExpected = new BankTransaction();
        bankTransactionExpected.setAmount(BigDecimal.valueOf(200.00));

        BankTransaction bankTransaction = exampleBulkyMethod.calculateExpense(
            BigDecimal.valueOf(200.00),
            BigDecimal.valueOf(10.00),
            BigDecimal.valueOf(120.00),
            BigDecimal.valueOf(100.00),
            BigDecimal.valueOf(200.00),
            OperationType.WITHDRAW
        );

        assertEquals(bankTransaction.getAmount(), bankTransactionExpected.getAmount());

    }

}