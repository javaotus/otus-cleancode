package ru.otus.example.cleancode.models.ex2;

import ru.otus.example.cleancode.models.ex2.employee.AbstractEmployee;
import ru.otus.example.cleancode.models.ex2.employee.CommissionedEmployee;
import ru.otus.example.cleancode.models.ex2.employee.HourlyEmployee;
import ru.otus.example.cleancode.models.ex2.employee.SalariedEmployee;

public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public AbstractEmployee makeEmployee(EmployeeRecord r) {
        return switch (r.type) {
            case HOURLY -> new HourlyEmployee(r);
            case SALARIED -> new SalariedEmployee(r);
            case COMMISSIONED -> new CommissionedEmployee(r);
        };
    }

}