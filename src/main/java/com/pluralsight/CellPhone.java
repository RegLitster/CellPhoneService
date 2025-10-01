package com.pluralsight;

public class CellPhone {

    //serialNumber (ex: 1000000 - 9999999)
//-             model (ex: iPhone X)
//-             carrier (ex: AT&T)
//-             phoneNumber (ex: 800-555-5555)
//-             owner (ex: Dana Wyatt)
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;

    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public  String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public void dial(String phoneNumber){
        System.out.printf("%s's phone is calling %s\n",owner,phoneNumber);
    }


}