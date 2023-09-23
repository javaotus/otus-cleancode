package ru.otus.example.cleancode.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import ru.otus.example.cleancode.bulkycode.BankTransaction;
import ru.otus.example.cleancode.models.ex3.InsuranceCompanyDto;

@Mapper
public interface BankTransactionMapper extends AnotherMapper {

    @Mappings({
        @Mapping(source = "transactionId", target = "id"),
        @Mapping(source = "transactionDate", target = "date", qualifiedByName = "getConvertedDate"),
        @Mapping(source = "active", target = "transactionActive"),
        @Mapping(source = "bankTransactionType", target = "insuranceType", qualifiedByName = "getInsuranceType")
    })
    InsuranceCompanyDto bankTransactionToInsuranceCompanyDto(BankTransaction bankTransaction);

}