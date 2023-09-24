package ru.otus.example.cleancode.lesson5.compact.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import ru.otus.example.cleancode.lesson5.bulky.dtos.BankTransactionDto;
import ru.otus.example.cleancode.lesson5.bulky.dtos.InsuranceCompanyDto;

@Mapper
public interface BankTransactionMapper {

    InsuranceCompanyDto bankTransactionToInsuranceCompanyDto(BankTransactionDto bankTransactionDto);

}