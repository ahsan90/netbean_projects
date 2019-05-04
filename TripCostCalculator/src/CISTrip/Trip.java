
package CISTrip;

/**
 * Trip class for Assignment #3
 * @author Md Ahsanul Hoque
 * @since 20180914
 */
public class Trip {
    private int distance;
    public final static int MILEAGE = 14;
    public final static double COST_PER_LITRE = 1.29;
    
    // Default constructor
    public Trip(){}
    
    //Constructor that accepts distance
    public Trip(int distance){
        setDistance(distance);
    }
    
    //getter function
    public int getDistance(){
        return distance;
    }
    
    //setter funciotn
    public void setDistance(int distance){
        this.distance = distance;
    }
    
    public double getLitresUsed(){
        double gasUsedInLitres = ((MILEAGE/100.0) * distance);
        return gasUsedInLitres;
    }
    public double getCost(){
        return getLitresUsed() * COST_PER_LITRE;
    }
    public String toString(){
        String output = "Trip Details\n"
                        +"Distance " + distance + " km\n"
                        +"Litres Used: " + (int)getLitresUsed()
                        +"\nCost: " + getCost();
        return output;
    }
}
