package ru.otus.example.cleancode.lesson3.compact.employees;

import ru.otus.example.cleancode.lesson3.compact.EmployeeRecord;
import ru.otus.example.cleancode.lesson3.compact.Money;

public class HourlyEmployee extends AbstractEmployee {

    private EmployeeRecord employeeRecord;

    public HourlyEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
