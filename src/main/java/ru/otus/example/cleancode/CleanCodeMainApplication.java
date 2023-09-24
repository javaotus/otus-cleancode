package ru.otus.example.cleancode;

import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.compact.services.InsuranceCompanyIntegrationService;

import java.math.BigDecimal;
import java.util.UUID;

public class CleanCodeMainApplication {

    public static void main(String[] args) {

        InsuranceCompanyIntegrationService insuranceCompanyIntegrationService = new InsuranceCompanyIntegrationService();

        BankTransactionDto bankTransactionDto = new BankTransactionDto();
        bankTransactionDto.setTransactionId(UUID.randomUUID());
        bankTransactionDto.setTransactionName("transaction1");
        bankTransactionDto.setActive(true);
        bankTransactionDto.setAmount(BigDecimal.valueOf(100));

        System.out.println(insuranceCompanyIntegrationService.transferBankTransaction(bankTransactionDto));

    }

}