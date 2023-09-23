package ru.otus.example.cleancode.mappers;

import org.mapstruct.Named;
import ru.otus.example.cleancode.bulkycode.BankTransactionType;
import ru.otus.example.cleancode.models.ex3.InsuranceType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public interface AnotherMapper {


    @Named("getConvertedDate")
    default Date getConvertedDate(LocalDate localDate) throws ParseException {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        return simpleDateFormat.parse(localDate.format(DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH)));
    }

    @Named("getInsuranceType")
    default InsuranceType getInsuranceType(BankTransactionType bankTransactionType) {
        return bankTransactionType.equals(BankTransactionType.DEBIT) ? InsuranceType.DEBIT_TYPE : InsuranceType.CREDIT_TYPE;
    }


}
