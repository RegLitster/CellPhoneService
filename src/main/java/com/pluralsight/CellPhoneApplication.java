package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone Phone = new CellPhone();

        System.out.print("Cell Serial Number:");
        int serialNumber = input.nextInt();
        Phone.setSerialNumber(serialNumber);

        System.out.print("Cell Model:");
        String model = input.next().trim();
        Phone.setModel(model);

        System.out.print("Cell Carrier:");
        String carrier = input.next().trim();
        Phone.setCarrier(carrier);

        System.out.print("Phone Number:");
        String phoneNum = input.next().trim();
        Phone.setPhoneNumber(phoneNum);

        System.out.print("Owner:");
        String owner = input.next().trim();
        Phone.setOwner(owner);

        System.out.printf("Serial Number: %d\nCell Model: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s",serialNumber,model,carrier,phoneNum,owner);

        System.out.println(Phone.getOwner());

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setOwner("Danna Wyatt");
        cellPhone1.setPhoneNumber("808-555-3000");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setOwner("John Debby");
        cellPhone2.setPhoneNumber("412-565-1234");

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        display(cellPhone1);
        display(cellPhone2);

    }
    public static void display(CellPhone Phone){
            System.out.printf("Owner: %s\n", Phone.getOwner());
            System.out.printf("Phone Number: %s\n", Phone.getPhoneNumber());
    }





}