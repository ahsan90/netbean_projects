
package cis;

/**
 * PickerTest class for testing Picker class
 * @author Ahsanul Hoque
 * @since 20181125
 */
public class PickerTest {
    public static void main(String[] args) {
        
        CisUtility.setIsGUI(true);
        
        Picker aPicker = new Picker();
        
        aPicker.getPickerInfoFromUser();
        
        aPicker.displayPickerReport();
    }
}
