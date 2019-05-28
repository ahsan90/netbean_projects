/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis;

/**
 * @Vehicle class
 * @since 20181207
 * @author Md Ahsanul Hoque
 */
public class Vehicle {
    private double price;
    private double mileage;
    private String transmission;
    private boolean sunroof;
    private double currentValue;
    
    /**
    * @Custom Constructor that accepts parameter for properties
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public Vehicle(double price, double mileage, String transmission,
            String sunroof){
        this.price = price;
        this.mileage = mileage;
        setTransmission(transmission);
        isSunroof(sunroof);
        calcCurrentValue(this.mileage);
    }
    
    /**
    * @getter method currentValue
    */
    public double getCurrentValue(){
        return this.currentValue;
    }
    
    /**
    * @a method that sets transmission using switch, case, break
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public void setTransmission(String transmission){
        switch (transmission.toUpperCase()) {
            case "A":  
                this.transmission = "A";
                break;
            case "M":  
                this.transmission = "M";
                break;
        }     
    }
    /**
    * @sets the the value of sunroof attributes
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public void isSunroof(String sunroof){
        switch(sunroof.toUpperCase()){
            case "Y" :
                this.sunroof = true;
                break;
            case "N" :
                this.sunroof = false;
        }
    }
    
    /**
    * @a method that calculates car value base on price
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public double calcPriceBasedOnMileage(double mileage){
        double cost = 0;
        if(mileage >= 0 && mileage <= 59999){
            cost = price - price * 0.30;
        }
        else if(mileage>=60000 && mileage<=99999){
            cost = price - price * 0.30;
        }
        else if(mileage >= 100000 && mileage <= 199999){
            cost = price - price * 0.40;
        }else{
            cost = price - price * 0.50;
        }
        return cost;
    }
    /**
    * @a method that calculates car's final current value
    * @since 20181207
    * @author Md Ahsanul Hoque
    */
    public void calcCurrentValue(double mileage){
        double cost = 0;
        if(transmission.equals("A")){
            cost = calcPriceBasedOnMileage(mileage) + this.price * .05;
        }
        if(transmission.equals("M")){
            cost = calcPriceBasedOnMileage(mileage) - this.price * .05;
        }
        
        cost = sunroof ? cost + this.price * .10 :
                    cost;
        this.currentValue = cost;
    }
}
