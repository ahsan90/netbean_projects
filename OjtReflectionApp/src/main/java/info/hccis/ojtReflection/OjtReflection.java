package info.hccis.ojtReflection;

import com.google.gson.Gson;
import java.util.Scanner;

/**
 * This class will represent a OjtRefleciton.
 *
 * @author bjmaclean, renamed and modified by Md Ahsanul Hoque in 20190920
 * @since 20150915
 */
public class OjtReflection {

    private static int maxStudentId;
    private int studentId;
    private String name;
    private String reflectionText;
   
    
     /**
     * Default constructor
     * @since 20200920
     * @author Md Ahsanul Hoque
     */

    public OjtReflection() {}

    /**
     * Default constructor which will get info from user
     *
     * @since 20150917
     * @author BJ MacLean, renamed and modified by Md Ahsanul Hoque in 20190920
     */
    public OjtReflection(boolean getFromUser) {
        if (getFromUser) {
            System.out.println("Enter student id: ");
            this.studentId = FileUtility.getInput().nextInt();
            
            System.out.println("Enter name name: ");
            FileUtility.getInput().nextLine();
            this.name = FileUtility.getInput().nextLine();
            System.out.println("Enter reflection text: ");
            this.reflectionText = FileUtility.getInput().nextLine();
        }
    }

    /**
     * Custom constructor with all info
     *
     * @param studentId
     * @param name
     * @param reflectionText
     *
     * @author BJ MacLean, renamed and modified by Md Ahsanul Hoque in 20190920
     * @since 20150917
     */
    public OjtReflection(int studentId, String name, String reflectionText) {
        this.studentId = studentId;
        this.name = name;
        this.reflectionText = reflectionText;
    }

    /**
     * constructor which will create from String array
     *
     * @since 20150917
     * @author BJ MacLean, renamed and modified by Md Ahsanul Hoque in 20190920
     */
    public OjtReflection(String[] parts) {
        this(Integer.parseInt(parts[0]), parts[1], parts[2]);
        /*
         This makes sure that we capture/set the maximum registration id as we load
         all of the entries from the file.  Then when we add a new reflection it will
         use this to set the next student id.
         */
        if (Integer.parseInt(parts[0]) > maxStudentId) {
            maxStudentId = Integer.parseInt(parts[0]);
        }
    }

    /**
     * constructor which will create from String array
     *
     * @since 20150917
     * @author BJ MacLean, renamed and modified by Md Ahsanul Hoque in 20190920
     */
    public OjtReflection(String csvValues) {
        this(csvValues.split(","));
    }

    public String getCSV() {
        return studentId + "," + name + "," + reflectionText;
    }

    /**
     * This will give back the OjtReflection details
     *
     * @param withLineFeed Return with a line feed character
     * @return camper details
     * @since 20170915
     * @author cis2232
     */
    public String getCSV(boolean withLineFeed) {
        if (withLineFeed) {
            return getCSV() + System.lineSeparator();
        } else {
            return getCSV();
        }
    }

    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public static int getMaxStudentId() {
        return maxStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getReflectionText() {
        return reflectionText;
    }

    public void setReflectionText(String reflectionText) {
        this.reflectionText = reflectionText;
    }

    @Override
    public String toString() {
        return "studentId=" + studentId + ", name=" + name + ", reflectionText=" + reflectionText;
    }

}
