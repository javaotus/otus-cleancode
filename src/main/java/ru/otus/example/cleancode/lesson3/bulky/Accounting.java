package ru.otus.example.cleancode.lesson3.bulky;

public class Accounting {

    public Money calculatePay(Employee employee) {
        return switch (employee.getType()) {
            case COMMISSIONED -> calculateCommissionedPay();
            case HOURLY -> calculateHourlyPay();
            case SALARIED -> calculateSalariedPay();
        };
    }

    private Money calculateCommissionedPay() {
        return new Money();
    }

    private Money calculateHourlyPay() {
        return new Money();
    }

    private Money calculateSalariedPay() {
        return new Money();
    }

}