package ru.otus.example.cleancode.lesson5.compact.services;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.bulky.dtos.InsuranceCompanyDto;
import ru.otus.example.cleancode.lesson5.compact.mappers.BankTransactionMapper;

public class InsuranceCompanyIntegrationService {

    BankTransactionMapper bankTransactionMapper = Mappers.getMapper(BankTransactionMapper.class);

    public String transferBankTransaction(BankTransactionDto bankTransactionDto) {

        InsuranceCompanyDto insuranceCompanyDto = bankTransactionMapper.bankTransactionToInsuranceCompanyDto(bankTransactionDto);

        insuranceCompanyDto.setSendingResult(bankTransactionDto.getTransactionId() + "_" + bankTransactionDto.getTransactionName());

        System.out.println("Sending our DTO --> " + insuranceCompanyDto);

        return insuranceCompanyDto.getSendingResult();

    }

}