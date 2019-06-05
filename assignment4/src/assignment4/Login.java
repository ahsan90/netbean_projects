package assignment4;

import java.util.*;

/**
 * @Login class representation
 * @since 20190227
 * @author Md Ahsanul Hoque
 */
public class Login {
    
    private final int DEFAULT_VALUE_FOR_PASSWORD_INDEX_MISMACH = -1;
    private final int DEFAULT_VALUE_FOR_USER_NAME_INDEX_MISMACH = -2;
    
    private HashMap<String[], String[]> userCredentials = new HashMap<String[], String[]>();
    private ArrayList<String> loginAttemts = new ArrayList();
    
    /**
     * This will add data to userCredentials HashMap
     * @since 20190227
     * @author Md Ahsanul Hoque
     */
    public void loadCredentials(String[] userNames, String[] password){
        userCredentials.put(userNames, password);
    }
    
    /**
     * This will prompt for for entering login credentials and search on the HashMap
     * @since 20190227
     * @author Md Ahsanul Hoque
     */
    public void login(){
        int passwordIndex=0,userNameIndex=0;
        boolean isValid=false;
        String userName = CisUtility.getInputString("Enter user name: ");
        String password = CisUtility.getInputString("Enter password: ");
        for(String[] currentUser : userCredentials.keySet()){
            for(int i = 0; i<currentUser.length; i++){
                if (currentUser[i].equalsIgnoreCase(userName)) {
                    userNameIndex = i;
                    break;
                }else{
                    userNameIndex = DEFAULT_VALUE_FOR_USER_NAME_INDEX_MISMACH;
                }
            }
        }
        for(String[] currentUser : userCredentials.values()){
            for(int i = 0; i<currentUser.length; i++){
                if (currentUser[i].equals(password)) {
                    passwordIndex = i;
                    break;
                }else{
                    passwordIndex = DEFAULT_VALUE_FOR_PASSWORD_INDEX_MISMACH;
                }
            }
        }
        if (isValidLogin(userNameIndex, passwordIndex)) {
            CisUtility.display("Successful login");
            isValid = true;
            loginAttemts.add(userName+"/"+password+ " " +isValid);
        }
        else {
            CisUtility.display("Login failed");
            loginAttemts.add(userName+"/"+password+ " " +isValid);
        }
    }
    
    /**
     * This will show all login attempts.
     * @since 20190227
     * @author Md Ahsanul Hoque
     */
    public void showAttempts(){
        for(String attempt: loginAttemts){
            CisUtility.display(attempt);
        }
    }
    /**
     * This will boolean based on user's Credential found on HashMap according to appropriate indexing.
     * @since 20190227
     * @author BJM
     */
    private boolean isValidLogin(int userNameIndex,int passwordIndex){
        return userNameIndex == passwordIndex;
    }
}
