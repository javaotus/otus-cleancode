package ru.otus.example.cleancode.lesson5.bulky.services;

import org.junit.Test;

import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.bulky.dtos.InsuranceCompanyDto;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class InsuranceCompanyIntegrationServiceTest {

    @Test
    public void mustReturnCorrectSendingResult() {

        InsuranceCompanyIntegrationService insuranceCompanyIntegrationService = new InsuranceCompanyIntegrationService();

        BankTransactionDto bankTransactionDto = new BankTransactionDto();
        bankTransactionDto.setTransactionId(UUID.randomUUID());
        bankTransactionDto.setTransactionName("transaction1");
        bankTransactionDto.setActive(true);
        bankTransactionDto.setAmount(BigDecimal.valueOf(100));

        String result = insuranceCompanyIntegrationService.transferBankTransaction(bankTransactionDto);

        assertEquals(bankTransactionDto.getTransactionId() + "_transaction1", result);
    }

}
