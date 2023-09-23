package ru.otus.example.cleancode.models.ex2;

import ru.otus.example.cleancode.models.ex2.employee.AbstractEmployee;

public interface EmployeeFactory {
    AbstractEmployee makeEmployee(EmployeeRecord r);

}