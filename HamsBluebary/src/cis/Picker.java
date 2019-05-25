
package cis;

/**
 * Picker class for implementing the Ham's Blueberry Patch program
 * @author Ahsanul Hoque
 * @since 20181125
 */
public class Picker {
    
    public static String BUSINESS_NAME = "Ham's Blueberry Patch";
    public static final String EXIT = "X";
    public static final int MAX_BOX=50,MIN_BOX=1;
    
    private String userChoise;
    private String pickerName;
    private int numberOfBoxes;
    private String highestBoxPickerName;
    private int highestBoxPicked;
    private int totalNumberOfPickers;
    private int totalNumberOfBoxes;
    private int averageBoxesPicked;
    
    //setter for PickerName
    public void setPickerName(String pickerName){
        this.pickerName = pickerName;
    }
    //getter for AverageBoxesPicked
    public int getAverageBoxesPicked(){
        return averageBoxesPicked;
    }
    
    /**
     * Default Constructor 
     * @author Ahsanul Hoque
     * @since 20181125
     */
    public Picker(){
        this.highestBoxPickerName = "Not found";
        this.totalNumberOfPickers = 0;
        this.totalNumberOfBoxes = 0;
        this.highestBoxPicked = 0;
    }
    
    /**
     * A method for getting for getting Picker information from user 
     * @author Ahsanul Hoque
     * @since 20181125
     */
    public void getPickerInfoFromUser(){
        int temp = 0;
        do{
            this.userChoise = CisUtility.getInputString("Enter Picker Name or X to exit the program: ");
            if(!this.userChoise.toUpperCase().equals(EXIT)){
                setPickerName(this.userChoise);
                temp = CisUtility.getInputInt("Enter box number between 1 and 50 (inclusive) fot that picker: ");
                while(true){
                    if(temp >= MIN_BOX && temp <= MAX_BOX){
                        this.numberOfBoxes = temp;
                        break;
                    }else{
                        CisUtility.display("Invalid box number input.");
                        this.numberOfBoxes = CisUtility.getInputInt("Enter box number between 1 and 50 (inclusive) fot that picker: ");
                        break;
                    }
                }
                processNewPicker(pickerName, numberOfBoxes);
            }
            else if(this.userChoise.toUpperCase().equals(EXIT)){
                //processNewPicker(this.pickerName, this.numberOfBoxes);
                break;
            }
        }while(true);
    }
    
    /**
     * A method that processes the functionalities of a new Picker 
     * @author Ahsanul Hoque
     * @since 20181125
     */
    public void processNewPicker(String name, int numberOfBoxes){
       if(this.highestBoxPicked < numberOfBoxes){
           this.highestBoxPicked = numberOfBoxes;
           this.highestBoxPickerName = name;
           this.totalNumberOfBoxes = totalNumberOfBoxes + numberOfBoxes;
           this.totalNumberOfPickers++;
           this.averageBoxesPicked = (int)(this.totalNumberOfBoxes/this.totalNumberOfPickers);
       }
       else if(this.highestBoxPicked == numberOfBoxes){
           this.highestBoxPicked = numberOfBoxes;
           this.highestBoxPickerName += ", "+name;
           this.totalNumberOfBoxes = totalNumberOfBoxes + numberOfBoxes;
           this.totalNumberOfPickers++;
           this.averageBoxesPicked = (int)(this.totalNumberOfBoxes/this.totalNumberOfPickers);
       }
       else{
           this.totalNumberOfBoxes += numberOfBoxes;
           this.totalNumberOfPickers++;
           this.averageBoxesPicked = (int)(this.totalNumberOfBoxes/this.totalNumberOfPickers);
       }
    }
    /**
     * A method for displaying picker report
     * @author Ahsanul Hoque
     * @since 20181125
     */
    public void displayPickerReport(){
        String output = BUSINESS_NAME+"\n"
                +"Daily Summary\n\n"
                +"Number pickers: "+this.totalNumberOfPickers +"\n"
                +"Most productive picker: " + this.highestBoxPickerName +"\n"
                +"Average boxes picked: " + this.averageBoxesPicked;
        CisUtility.display(output);
    }
}
