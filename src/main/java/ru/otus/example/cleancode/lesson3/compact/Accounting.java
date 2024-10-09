package ru.otus.example.cleancode.lesson3.compact;

import ru.otus.example.cleancode.lesson3.compact.employees.EmployeeFactory;
import ru.otus.example.cleancode.lesson3.compact.employees.EmployeeFactoryImpl;

public class Accounting {

   private final EmployeeFactory employeeFactory = new EmployeeFactoryImpl();

   public void formPayRoll() {
       EmployeeRecord employeeRecord = new EmployeeRecord();
       employeeRecord.setType(EmployeeRecord.EmployeeType.COMMISSIONED);
       Money money = employeeFactory.makeEmployee(employeeRecord).calculatePay();
   }

}