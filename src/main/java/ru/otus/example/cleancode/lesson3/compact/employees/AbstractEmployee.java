package ru.otus.example.cleancode.lesson3.compact.employees;

import ru.otus.example.cleancode.lesson3.compact.Money;

public abstract class AbstractEmployee {

    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);

}