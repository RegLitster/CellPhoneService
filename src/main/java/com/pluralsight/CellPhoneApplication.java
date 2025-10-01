package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        CellPhone cellPhone3 = new CellPhone(9999999,"Samsung","At&t","858-515-9000","Doug Jones");

        System.out.print("Cell Serial Number:");
        int serialNumber = input.nextInt();
        input.nextLine();
        phone.setSerialNumber(serialNumber);

        System.out.print("Cell Model:");
        String model = input.nextLine().trim();
        phone.setModel(model);

        System.out.print("Cell Carrier:");
        String carrier = input.nextLine().trim();
        phone.setCarrier(carrier);

        System.out.print("Phone Number:");
        String phoneNum = input.nextLine().trim();
        phone.setPhoneNumber(phoneNum);

        System.out.print("Owner:");
        String owner = input.nextLine().trim();
        phone.setOwner(owner);

        System.out.printf("Serial Number: %d\nCell Model: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s\n",serialNumber,model,carrier,phoneNum,owner);


        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setOwner("Danna Wyatt");
        cellPhone1.setPhoneNumber("808-555-3000");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setOwner("John Debby");
        cellPhone2.setPhoneNumber("412-565-1234");

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone2);

        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);


    }
    public static void display(CellPhone Phone){
            System.out.printf("Owner: %s\n", Phone.getOwner());
            System.out.printf("Phone Number: %s\n", Phone.getPhoneNumber());

    }





}