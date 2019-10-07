package info.hccis.ojtReflection;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author bjmaclean, renamed and modified by Md Ahsanul Hoque in 20190920
 */
public class MainClass {

    public static String MENU = "Menu Options:\nA) Add reflection\nS) Show reflection\nU) Update refleciotn\nX) Exit";
    public static final String PATH = "C:/cis2232_20192020/";
    public static String FILE_NAME = PATH + "reflection.json";
    
    public static ArrayList<OjtReflection> theList = new ArrayList();

    public static void main(String[] args) throws IOException {
        //Create a file
        Files.createDirectories(Paths.get(PATH));

        
        loadReflections(theList);
        String option;
        do {
            System.out.println(MENU);
            option = FileUtility.getInput().nextLine().toUpperCase();

            switch (option) {
                case "A":
                    //System.out.println("Picked A");
                    OjtReflection newReflection = new OjtReflection(true);
                    theList.add(newReflection);
                    
                    //Add reflection
                    addReflection(newReflection);
                    
                           
                    System.out.println("Done");

                    break;

                case "S":
                    System.out.println("Here are the reflections, total(" + countReflection() + ")");
                    for (OjtReflection reflection : theList) {
                        System.out.println(reflection);
                    }
                    break;
                case "U":
                    int tempId=0;
                   
                    
                    System.out.println("Enter the student id to update: ");
                    //FileUtility.getInput().nextLine();
                    
                    try {
                        OjtReflection aReflection = new OjtReflection();
                        
                        tempId = FileUtility.getInput().nextInt();
                        
                        //update reflection based user input
                        updateReflection(tempId, aReflection);
                    
                    }catch(InputMismatchException e){
                        System.out.println("Something is wrong with you input value");
                    }
                    
                    
                    deleteFile(); // This will delete the old file
                    System.out.println("Here are the list after updating reflections (total " + countReflection() +")\n");
                    for(OjtReflection reflection: theList){
                        System.out.println(reflection.toString());
                        addReflection(reflection); // This will store the updated information from arrayList into newly created json file
                    }
                    break;
                case "X":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        } while (!option.equalsIgnoreCase("x"));
    }
    
     /**
     * This method will delete the reflection file
     * @param 
     * @modified since 20190920
     * @author Md Ahsanul Hoque
     */  
    public  static void deleteFile(){
        Path file_path = Paths.get("C:\\cis2232_20192020\\reflection.json");
        
        try{
            Files.delete(file_path);
        }catch(IOException e){
            System.out.println("Operation cannot be perfomed");
        }
    }
    /**
     * This method will add the reflection in the file
     * @param aReflection
     * @modified since 20190920
     * @original author BJ, modified and extracted by Md Ahsanul Hoque
     */
    private static void addReflection(OjtReflection aReflection) {
        //Also write to the file when a new reflection was added!!
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(FILE_NAME, true);
            bw = new BufferedWriter(fw);
            
            
            //
            Gson gson = new Gson();
            String jsonInString = gson.toJson(aReflection);
            //bjm 20190917 Adding line break
            bw.write(jsonInString+System.lineSeparator());
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                
                if (fw != null) {
                    fw.close();
                }
                
            } catch (IOException ex) {
                
                ex.printStackTrace();
                
            }
            
        }
    }
    /**
     * This method will update the reflection in the arrayList
     *
     * @param tempId, 
     * @param aReflection
     * @since 20190920
     * @author Md Ahsanul Hoque
     */
    private static void updateReflection(int tempId, OjtReflection aReflection) {
        OjtReflection existingReflection;
        if(isStudentExists(tempId)){
            System.out.println("Enter the following student's information to update\nEnter name: ");
            FileUtility.getInput().nextLine();
            String tempName = FileUtility.getInput().nextLine();
            System.out.println("Enter reflection text: ");
            String tempReflectionText = FileUtility.getInput().nextLine();
            
            aReflection.setStudentId(tempId);
            
            // The following code in if block with updated name and reflection text but not with null value
            if(!tempName.equalsIgnoreCase("") && !tempReflectionText.equalsIgnoreCase("")){
                aReflection.setName(tempName);
                aReflection.setReflectionText(tempReflectionText);
            }else{
                existingReflection = theList.get(tempId-1);
                
                //The following code update the reflection with existing reflection property when either one is null or provided no value during updating student's info
                if(!tempName.equalsIgnoreCase("")){
                    aReflection.setName(tempName);
                    aReflection.setReflectionText(existingReflection.getReflectionText());
                    aReflection.setStudentId(tempId);
                }else{
                    aReflection.setName(existingReflection.getName());
                    aReflection.setReflectionText(tempReflectionText);
                }
            }
            theList.set(tempId-1, aReflection);
        }else{
            System.out.println("The student not found with the id you entered");
        }
    }

    /**
     * This method will load the reflections from the file at the program startup.
     *
     * @param reflections
     * @since 20150917
     * @author BJ MacLean
     */
    public static void loadReflections(ArrayList reflections) {
        System.out.println("Loading reflecitons from file");
        int count = 0;

        try {
            ArrayList<String> test = (ArrayList<String>) Files.readAllLines(Paths.get(FILE_NAME));

            for (String current : test) {
                System.out.println("Loading:  " + current);
                //Get a reflection from the string
                //Camper temp = new OjtReflection(current);
                Gson gson = new Gson();
                OjtReflection temp = gson.fromJson(current, OjtReflection.class);
                reflections.add(temp);
                count++;
            }

        } catch (IOException ex) {
            System.out.println("Error loading reflections from file.");
            System.out.println(ex.getMessage());
        }

        System.out.println("Finished...Loading reflection from file (Loaded " + count + " reflections)\n\n");

    }
    
    /**
     * This method will count total reflections and return the value
     * @param 
     * @since 20190920
     * @author Md Ahsanul Hoque
     */
    public static int countReflection(){
        int count = 0;
        for(OjtReflection reflection: theList){
            count++;
        }
        return count;
    }
    
    /**
     * This method will check whether the student is exists in the arrayList or not
     *
     * @param id
     * @since 20190920
     * @author Md Ahsanul Hoque
     */
    public static boolean isStudentExists(int id){
        boolean flag = false;
        for(OjtReflection reflection: theList){
            if(reflection.getStudentId() == id){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
