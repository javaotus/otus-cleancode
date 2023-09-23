package ru.otus.example.cleancode.models.ex2.employee;

import ru.otus.example.cleancode.models.ex1.Money;
import ru.otus.example.cleancode.models.ex2.EmployeeRecord;
import ru.otus.example.cleancode.models.ex2.employee.AbstractEmployee;

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