package ru.otus.example.cleancode.lesson3.compact.employees;

import ru.otus.example.cleancode.lesson3.compact.EmployeeRecord;

public interface EmployeeFactory {
    AbstractEmployee makeEmployee(EmployeeRecord record);
}