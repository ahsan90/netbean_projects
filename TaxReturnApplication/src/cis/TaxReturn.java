
package cis;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TaxReturn class that holds it properties and methods
 * @author Ahsanul Hoque
 * @since 20181202
 */
public class TaxReturn {
    public static String MARRIED = "M";
    public static String SINGLE = "S";
    private String ssn;
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private double annualIncome;
    private String maritalStatus;
    private double taxLiability;
    
    /**
    * Custom Constructor that accepts it's parameters and holds the value of taxLiability
    * @author Ahsanul Hoque
    * @since 20181202
    */
    public TaxReturn(String ssn, String lastName, String firstName,
            String streetAddress, String city, String state,String zipCode,
            double annualIncome, String maritalStatus){
            this.ssn = ssn;
            this.lastName = lastName;
            this.firstName = firstName;
            this.streetAddress = streetAddress;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.annualIncome = annualIncome;
            this.maritalStatus = maritalStatus;
            this.taxLiability = calculateLiability(this.annualIncome,this.maritalStatus);
    }
    
    /**
    * Method that calculates liability
    * @author Md Ahsanul Hoque
    * @since 20181202
    */
    public double calculateLiability(double annualIncome, String maritalStatus){
       double liabilityCost = 0;
       if(annualIncome >= 0 && annualIncome <= 20000){
           liabilityCost = maritalStatus.toUpperCase().equals(SINGLE) ? annualIncome * 0.15 : annualIncome * 0.14;
       }
       else if(annualIncome >= 20001 && annualIncome <= 50000){
           liabilityCost = maritalStatus.toUpperCase().equals(SINGLE) ? annualIncome * 0.22 : annualIncome * 0.20;
       }
       else{
           liabilityCost = maritalStatus.toUpperCase().equals(SINGLE) ? annualIncome * 0.30 : annualIncome * 0.28;
       }
       return liabilityCost;
    }
    
    /**
    * display() method for displaying information
    * @author Ahsanul Hoque
    * @since 20181202
    */
    public void display(){
        CisUtility.display(toString());
    }
    
    /**
    * Method that returns a string
    * @author Ahsanul Hoque
    * @since 20181202
    */
    public String toString(){
        String output = "Social Security Number: " + this.ssn +"\n"
                +"First Name: "+this.firstName+"\n"
                +"Last Name: "+this.lastName + "\n"
                +"Street Address: "+this.streetAddress + "\n"
                +"City: " +this.city+"\n"
                +"State: "+this.state + "\n"
                +"Zip code: "+ this.zipCode +"\n"
                +"Annual income: $" + this.annualIncome + "\n"
                +"Marital status :" + (this.maritalStatus.toUpperCase().equals(MARRIED)? "Married" : "Single")+ "\n"
                +"Total TAX liability: $" + this.taxLiability;
        return output;
    }
}
