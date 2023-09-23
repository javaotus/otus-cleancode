package ru.otus.example.cleancode.utils;

import ru.otus.example.cleancode.bulkycode.BankTransaction;
import ru.otus.example.cleancode.bulkycode.BankTransactionType;
import ru.otus.example.cleancode.models.ex3.InsuranceCompanyDto;
import ru.otus.example.cleancode.models.ex3.InsuranceType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Converters {

    public static InsuranceCompanyDto convertBankTransactionToInsuranceCompanyDto(BankTransaction bankTransaction) throws ParseException {

        InsuranceCompanyDto insuranceCompanyDto = new InsuranceCompanyDto();

        insuranceCompanyDto.setTransactionName(bankTransaction.getTransactionName());
        insuranceCompanyDto.setId(bankTransaction.getTransactionId());
        insuranceCompanyDto.setAmount(bankTransaction.getAmount());
        insuranceCompanyDto.setDate(convertLocalDateToDate(bankTransaction.getTransactionDate()));
        insuranceCompanyDto.setTransactionActive(bankTransaction.isActive());
        insuranceCompanyDto.setInsuranceType(convertBankTransactionTypeToInsuranceType(bankTransaction.getBankTransactionType()));

        return insuranceCompanyDto;

    }

    private static Date convertLocalDateToDate(LocalDate localDate) throws ParseException {
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        String formattedString = localDate.format(formatter);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        return simpleDateFormat.parse(formattedString);
    }

    private static InsuranceType convertBankTransactionTypeToInsuranceType(BankTransactionType bankTransactionType) {
        return bankTransactionType.equals(BankTransactionType.DEBIT) ? InsuranceType.DEBIT_TYPE : InsuranceType.CREDIT_TYPE;
    }

}