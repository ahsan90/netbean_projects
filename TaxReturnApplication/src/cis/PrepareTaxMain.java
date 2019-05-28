
package cis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PrepareTaxMain class that use TaxReturn class's attributes
 * @author Ahsanul Hoque
 * @since 20181111
 */
public class PrepareTaxMain {
    
    public static String SSN_REGEX = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";

    public static void main(String[] args) {
        
        String ssn = CisUtility.getInputString("Enter Your Social Security Number(SSN) in a format like 999-99-9999: ");
        while(!isValidSnn(ssn)){
            CisUtility.display("Invalid SSN");
            ssn = CisUtility.getInputString("Enter Your Social Security Number(SSN) in a format like 999-99-9999: ");
        }
        String firstName = CisUtility.getInputString("Enter your first name: ");
        String lastName = CisUtility.getInputString("Enter your last name: ");
        String streetAddress = CisUtility.getInputString("Enter your street address: ");
        String city = CisUtility.getInputString("Enter the name of your city: ");
        String state = CisUtility.getInputString("Enter the name of state: ");
        String zipCode = CisUtility.getInputString("Enter Zip Code: ");
        while(!isValidZipCode(zipCode)){
            CisUtility.display("Invalid zip code");
            zipCode = CisUtility.getInputString("Your Zip Code includes five digits: ");
        }
        double annualIncome = CisUtility.getInputDouble("Enter your annual income");
        while(!isValidAnnualIncome(annualIncome)){
            annualIncome = CisUtility.getInputDouble("Enter valid annula income: ");
        }
        String maritalStatus = CisUtility.getInputString("Enter your marital status married(m), single(s): ");
        while(!isValidMaritalStatus(maritalStatus)){
            CisUtility.display("Invalid input");
            maritalStatus = CisUtility.getInputString("Enter m for married or s for single: ");
        }
        TaxReturn txR = new TaxReturn(ssn, lastName, firstName,
            streetAddress, city, state, zipCode,
            annualIncome, maritalStatus);
        txR.display();
    }
    
    /**
    * @Method that validate ssn
    * @Referrence https://bit.ly/2rai9iK
    * @author Md Ahsanul Hoque
    * @since 20181203
    */
    public static boolean isValidSnn(String ssn){
        Pattern pattern = Pattern.compile(SSN_REGEX);
        Matcher matcher = pattern.matcher(ssn);
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }
    
    /**
    * @method that validates zipcode
    * @author Ahsanul Hoque
    * @since 20181202
    */
    
    public static boolean isValidZipCode(String zipCode){
        int zipCodeLength = zipCode.length();
        if(zipCodeLength == 5 && validateDigits(zipCodeLength,zipCode)){
            return true;
        }else{
            return false;
        }
    }
    
    /**
    * @method that validates digits
    * @author Ahsanul Hoque
    * @since 20181202
    */
    public static boolean validateDigits(int index, String zipCode){
        boolean bool = true;
        for(int i = 0; i<index; i++){
            if(!Character.isDigit(zipCode.charAt(i))){
                bool = false;
                break;
            }
        }
        return bool;
    }
    /**
    * @method that validates marital status
    * @author Ahsanul Hoque
    * @since 20181202
    */
    public static boolean isValidMaritalStatus(String maritalStatus){
        if(maritalStatus.toUpperCase().equals(TaxReturn.MARRIED) ||
                maritalStatus.toUpperCase().equals(TaxReturn.SINGLE)){
            return true;
        }else{
            return false;
        }
    }
    
    /**
    * @method that validates annual Income
    * @author Ahsanul Hoque
    * @since 20181202
    */
    public static boolean isValidAnnualIncome(double annualIncome){
        if(annualIncome>=0){
            return true;
        }else{
            return false;
        }
    }
}
