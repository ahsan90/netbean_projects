
/**
 * FunrnitureTest class to test Order class
 * @author Ahsanul Hoque
 * @since 20181111
 */
public class FurnitureTest {
    public static final String TABLE = "Furniture Company\n"
            + "(1) Pine $" + Order.PINE_COST + "\n"
            + "(2) Oak $" + Order.OAK_COST + "\n"
            + "(3) Mahogoany $" + Order.MHOGANY_COST+ "\n"
            + "(0) Quit\n"
            + "-->";
    public static void main(String[] args) {
        int woodType = Utility.getInputInt(TABLE);

        Order userOrderChoice = new Order(woodType);
        
        
        
        if(userOrderChoice.getWoodType() >= 1 
                && userOrderChoice.getWoodType() <= 3){
            String output = "You chose " + userOrderChoice.choseWood(woodType)
                            + " and the price is $" +userOrderChoice.getPrice();
            System.out.println(output);
            
            int tableSize = Utility.getInputInt("Add a table size, (1)Large or (2)Small");
            switch (tableSize){
                
                case 1:
                    output = "You chose " + userOrderChoice.choseWood(woodType)
                            + " and the price is $" +(userOrderChoice.getPrice()+35);
                    break;
                case 2:
                    output = "You chose " + userOrderChoice.choseWood(woodType)
                            + " and the price is $" + userOrderChoice.getPrice();
                    break;
                default:
                    output = "Invalid table size\n"
                            +output;
                    break;
            }
            System.out.println(output);
        }
        else if(userOrderChoice.getWoodType() == 0){
            System.out.println("You quit");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
