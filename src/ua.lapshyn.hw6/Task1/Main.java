package com.company;

public class Main {

    public static void main(String[] args) {
        Phone htc = new Phone("+38(096) 422-65-75","Wildfire",130);
        Phone samsung = new Phone("+38(095) 338-34-73","Galaxy");
        Phone apple = new Phone();
        samsung.weight = 150.5;
        apple.number = "+38(099) 777-65-22";
        apple.model = "Max11";
        apple.weight = 133.3;
        System.out.println("Htc number:"+htc.number+"\t"+"model: "+htc.model+"\t"+"weight: "+htc.weight);
        System.out.println("Samsung number:"+samsung.number+"\t"+"model: "+samsung.model+"\t"+"weight: "+samsung.weight);
        System.out.println("Apple number:"+apple.number+"\t"+"model: "+apple.model+"\t"+"weight: "+apple.weight);
        htc.receiveCall("Alex");
        samsung.receiveCall("Jordan");
        apple.receiveCall("Andy");
        System.out.println("Htc number: "+htc.getNumber());
        System.out.println("Samsung number: "+samsung.getNumber());
        System.out.println("Apple number: "+apple.getNumber());

    }

}
