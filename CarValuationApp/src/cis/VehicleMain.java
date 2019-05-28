/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis;

import java.text.DecimalFormat;

/**
 * @Vehicle main class for testing Vehicle class
 * @since 20181207
 * @author Md Ahsanu Hoque
 */
public class VehicleMain {
    public static String str = "Enter another vehicles information?";
    
    public static void main(String[] args) {
        boolean isAnotherVehicle = true;
        String anotherVehicle = "";
        DecimalFormat currency = new DecimalFormat("$0.00");
        while(isAnotherVehicle){
            Vehicle v2 = getVehicleInfoFromUser();
            CisUtility.display("Your vehicle is now valued at: " + currency.format(v2.getCurrentValue()));
            anotherVehicle = CisUtility.getInputString(str);
            if(anotherVehicle.toUpperCase().equals("Y")){
                isAnotherVehicle = true;
            }else{
                isAnotherVehicle = false;
            }
        }
    }
    /**
    * @a method that take vehicle's information from user
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public static Vehicle getVehicleInfoFromUser(){
        double price = CisUtility.getInputDouble("Vehicle Price: ");
        double mileage = CisUtility.getInputDouble("Mileage on Vehicle: ");
        String transmission = CisUtility.getInputString("Transmission (A-automatic / M-manual): ");
        String sunroof = CisUtility.getInputString("Sunroof(Y/N): ");
        Vehicle v1 = new Vehicle(price, mileage, transmission, sunroof);    
        return v1;
    }
    
    /**
    * @a method that return Vehicle object
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public Vehicle getVehicleData(Vehicle v){
        return v;
    }
}
