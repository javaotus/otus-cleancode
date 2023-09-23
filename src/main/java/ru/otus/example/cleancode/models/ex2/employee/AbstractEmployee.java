package ru.otus.example.cleancode.models.ex2.employee;

import ru.otus.example.cleancode.models.ex1.Money;

public abstract class AbstractEmployee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);

}