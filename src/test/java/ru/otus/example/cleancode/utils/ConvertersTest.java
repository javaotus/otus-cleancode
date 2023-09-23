package ru.otus.example.cleancode.utils;

import org.junit.Test;

import org.mapstruct.factory.Mappers;

import ru.otus.example.cleancode.bulkycode.BankTransaction;
import ru.otus.example.cleancode.bulkycode.BankTransactionType;
import ru.otus.example.cleancode.mappers.BankTransactionMapper;
import ru.otus.example.cleancode.models.ex3.InsuranceCompanyDto;
import ru.otus.example.cleancode.models.ex3.InsuranceType;

import java.math.BigDecimal;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class ConvertersTest {

    @Test
    public void mustReturnConvertedObject() throws ParseException {

        BankTransaction bankTransaction = new BankTransaction();

        bankTransaction.setAmount(new BigDecimal("100.00"));
        bankTransaction.setTransactionName("New transaction");
        bankTransaction.setTransactionId(UUID.randomUUID());
        bankTransaction.setTransactionDate(LocalDate.of(2023, 10, 20));
        bankTransaction.setActive(true);
        bankTransaction.setBankTransactionType(BankTransactionType.DEBIT);

        InsuranceCompanyDto insuranceCompanyDto = Converters.convertBankTransactionToInsuranceCompanyDto(bankTransaction);

        assertEquals(InsuranceType.DEBIT_TYPE, insuranceCompanyDto.getInsuranceType());
        assertEquals(getCurrentDate(), insuranceCompanyDto.getDate());


    }

    @Test
    public void mustReturnConvertedObjectViaMapper() throws ParseException {

        BankTransactionMapper bankTransactionMapper = Mappers.getMapper(BankTransactionMapper.class);

        BankTransaction bankTransaction = new BankTransaction();

        bankTransaction.setAmount(new BigDecimal("100.00"));
        bankTransaction.setTransactionName("New transaction");
        bankTransaction.setTransactionId(UUID.randomUUID());
        bankTransaction.setTransactionDate(LocalDate.of(2023, 10, 20));
        bankTransaction.setActive(true);
        bankTransaction.setBankTransactionType(BankTransactionType.DEBIT);

        InsuranceCompanyDto insuranceCompanyDto = bankTransactionMapper.bankTransactionToInsuranceCompanyDto(bankTransaction);

        assertEquals(InsuranceType.DEBIT_TYPE, insuranceCompanyDto.getInsuranceType());
        assertEquals(getCurrentDate(), insuranceCompanyDto.getDate());

    }

    private static Date getCurrentDate() {
        return Date
                .from(LocalDate.of(2023, 10, 20)
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());
    }

}
