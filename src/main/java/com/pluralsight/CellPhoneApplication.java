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

        System.out.printf("Serial Number: %d\nCell Model: %s\nCarrier: %s\nPhone Number:%s\nOwner: %s",serialNumber,model,carrier,phoneNum,owner);


    }
}