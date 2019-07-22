/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democandles;

/**
 *
 * @author Ahsan
 */
public class DemoCandles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candle aCandle = new Candle();
        aCandle.setColor(Util.getInputString("Eneter the coulor of the canldle: "));
        aCandle.setHeight(Util.getInputDouble("Eneter Candle height: "));
        
        ScentedCandle aScentedCandle = new ScentedCandle();
        aScentedCandle.setColor(Util.getInputString("Eneter the coulor of the Scented canldle: "));
        aScentedCandle.setHeight(Util.getInputDouble("Eneter Scented Candle height: "));
        
        
        
        System.out.println("Candle details: \nColor: " + aCandle.getColor() 
                            +"\nHeight: " + aCandle.getHeight() 
                            +"\nPrice: " + aCandle.getPrice() + "\n\n"
                            +"Scented Candle details: "
                            +"\nColor: " +aScentedCandle.getColor()
                            +"\nHeight: " + aScentedCandle.getHeight()
                            +"\nPrice: " + aScentedCandle.getScent());
        
    }
    
}
