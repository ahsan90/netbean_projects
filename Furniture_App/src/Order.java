/**
 * Order class for implementing the Furniture application
 * @author Ahsanul Hoque
 * @since 20181111
 */
public class Order {
    private int woodType;
    
    public static int PINE_COST = 100;
    public static int OAK_COST = 225;
    public static int MHOGANY_COST = 310;
    
    /**
     * @return the woodType
     */
    public int getWoodType() {
        return woodType;
    }
    /**
     * Custom constructor that accepts woodType parameter
     * @author Ahsanul Hoque
     * @since 20181111
     */
    public Order(int woodType){
        this.woodType = woodType;
    }
    

    /**
     * getPrice() method which return wood cost
     * @author Ahsanul Hoque
     * @since 20181111
     */
    public double getPrice(){
        double price=0.0;
        switch(getWoodType()){
            case 1:
                price = PINE_COST;
                break;
            case 2:
                price = OAK_COST;
                break;
            case 3:
                price = MHOGANY_COST;
                break;
            case 0:
                price = 0;
        }
        return price;
    }
    
    /**
     * A metho that return selected wood type by the user
     * @author Ahsanul Hoque
     * @since 20181111
     */
    public String choseWood(int i){
        String[] woodChosen = {"pine", "oak", "mahogany"};
        return woodChosen[i-1];
    }
}
