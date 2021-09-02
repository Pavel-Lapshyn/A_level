package com.company;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public String getNumber() {
        return this.number;
    }
}
