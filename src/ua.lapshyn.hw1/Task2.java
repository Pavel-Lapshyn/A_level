package com.company;
import java.util.Date;
public class Task2 {

    public static void main(String[] args) {
        Date currentDate = new Date();
        String firstName = "Pavel";
        String lastName = "Lapshyn";
        String os = System.getProperty("java.version");
        System.out.println("Java version: " + os);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Date: " + currentDate.toString());
    }
}
