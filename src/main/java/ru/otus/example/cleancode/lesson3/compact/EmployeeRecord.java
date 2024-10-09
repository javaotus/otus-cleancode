package ru.otus.example.cleancode.lesson3.compact;

public class EmployeeRecord {

    public EmployeeType type;

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public enum EmployeeType {
        COMMISSIONED, HOURLY, SALARIED
    }


}
