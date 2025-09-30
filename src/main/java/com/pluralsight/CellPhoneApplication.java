package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone Phone = new CellPhone();

        System.out.print("Cell Number serialNumber");
        String phonenumber = input.nextLine();
        Phone.setPhoneNumber(phonenumber);

        System.out.print("Cell Model");
        String model = input.nextLine();
        Phone.setModel(model);

        System.out.print();

    }
}
