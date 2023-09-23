package ru.otus.example.cleancode.models.ex2;

import ru.otus.example.cleancode.models.ex1.Money;

public class Accounting {

    private final EmployeeFactoryImpl employeeFactory = new EmployeeFactoryImpl();

    public void formPayRoll() {
        Money money = employeeFactory.makeEmployee(new EmployeeRecord()).calculatePay();

    }

}
