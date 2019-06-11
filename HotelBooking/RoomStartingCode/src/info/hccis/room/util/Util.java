package info.hccis.room.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Utility class for generic program functions.
 *
 * @author BJ MacLean
 * @since Feb 27, 2015
 */
public class Util {

    public static final boolean DEBUGGING = false;
    private static Scanner input = new Scanner(System.in);
    private static boolean isGUI = false;

    /**
     * Get a scanner object.
     *
     * @return Scanner
     * @since 20180226
     * @author CIS1232
     */
    public static Scanner getInput() {
        return input;
    }

    /**
     * Get input from the user using the appropriate input method
     *
     * @return String entered by user.
     * @since 20180226
     * @author CIS1232
     */
    public static String getInputString(String output) {
        if (isGUI) //use JoptionPane
        {
            return JOptionPane.showInputDialog(output);
        } else {
            display(output);
            return input.nextLine();
        }
    }

    /**
     * Get input from the user using the appropriate input method
     *
     * @return int entered by user
     * @since 20180226
     * @author CIS1232
     */
    public static int getInputInt(String output) {
        if (isGUI) //use JoptionPane
        {
            return Integer.parseInt(JOptionPane.showInputDialog(output));
        } else {
            display(output);
            return Integer.parseInt(input.nextLine());
        }
    }

    /**
     * Get input from the user using the appropriate input method
     *
     * @return double entered by user
     * @since 20180226
     * @author CIS1232
     */
    public static double getInputDouble(String output) {
        if (isGUI) //use JoptionPane
        {
            return Double.parseDouble(JOptionPane.showInputDialog(output));
        } else {
            display(output);
            return Double.parseDouble(input.nextLine());
        }
    }

    /**
     * Display output to the user using the appropriate input method
     *
     * @return void
     * @since 20180226
     * @author CIS1232
     */
    public static void display(String output) {
        if (isGUI) {
            JOptionPane.showMessageDialog(null, output);
        } else {
            System.out.println(output);
        }
    }

    /**
     * Set the gui indicator. If gui then JOptionPane will be used.
     *
     * @author Brandon the great
     * @param setter
     */
    public static void setGUI(boolean setter) {
        isGUI = setter;
    }

    /**
     * Get today in the specified format
     *
     * @since 20180301
     * @author BJM
     * @param format The format for the date
     */
    public static String getNow(String format) {
        if (format.isEmpty()) {
            format = "yyyy/MM/dd HH:mm:ss"; //Default
        }
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        return dateFormat.format(date);
    }
}
