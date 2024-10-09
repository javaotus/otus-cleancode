package ru.otus.example.cleancode.lesson3.compact.employees;

import ru.otus.example.cleancode.lesson3.compact.EmployeeRecord;

public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public AbstractEmployee makeEmployee(EmployeeRecord record) {
        return switch (record.type) {
            case COMMISSIONED -> new CommissionedEmployee(record);
            case HOURLY -> new SalaryEmployee(record);
            case SALARIED -> new CommissionedEmployee(record);
        };
    }

}