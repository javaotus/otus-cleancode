package ru.otus.example.cleancode.lesson5.bulky.services;

import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.bulky.dtos.InsuranceCompanyDto;

public class InsuranceCompanyIntegrationService {

    public String transferBankTransaction(BankTransactionDto bankTransactionDto) {

        InsuranceCompanyDto insuranceCompanyDto = new InsuranceCompanyDto();

        insuranceCompanyDto.setTransactionId(bankTransactionDto.getTransactionId());
        insuranceCompanyDto.setCustomerId(bankTransactionDto.getCustomerId());
        insuranceCompanyDto.setTransactionName(bankTransactionDto.getTransactionName());
        insuranceCompanyDto.setPaymentMethod(bankTransactionDto.getPaymentMethod());
        insuranceCompanyDto.setPaymentWay(bankTransactionDto.getPaymentWay());
        insuranceCompanyDto.setBankName(bankTransactionDto.getBankName());
        insuranceCompanyDto.setTransactionDate(bankTransactionDto.getTransactionDate());
        insuranceCompanyDto.setActive(bankTransactionDto.isActive());
        insuranceCompanyDto.setCleared(bankTransactionDto.isCleared());
        insuranceCompanyDto.setAmount(bankTransactionDto.getAmount());
        insuranceCompanyDto.setMinimumLimitDeposit(bankTransactionDto.getMinimumLimitDeposit());
        insuranceCompanyDto.setMaximumLimitDeposit(bankTransactionDto.getMaximumLimitDeposit());
        insuranceCompanyDto.setMinimumLimitWithdraw(bankTransactionDto.getMinimumLimitWithdraw());
        insuranceCompanyDto.setMaximumLimitWithdraw(bankTransactionDto.getMaximumLimitWithdraw());
        insuranceCompanyDto.setBankTransactionType(bankTransactionDto.getBankTransactionType());

        insuranceCompanyDto.setSendingResult(bankTransactionDto.getTransactionId() + "_" + bankTransactionDto.getTransactionName());

        System.out.println("Sending our DTO --> " + insuranceCompanyDto);

        return insuranceCompanyDto.getSendingResult();

    }

}