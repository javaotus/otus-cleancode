package ru.otus.example.cleancode.models.ex2;

public class EmployeeRecord {

    public Type type;

    public enum Type {
        COMMISSIONED ,
        HOURLY,
        SALARIED
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}