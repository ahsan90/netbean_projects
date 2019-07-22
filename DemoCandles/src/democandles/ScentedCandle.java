package democandles;

/**
 *
 * @author Ahsanul Hoque
 * @since 20190722
 */
public class ScentedCandle extends Candle{
    private double scent;

    public double getScent() {
        return scent;
    }

    public void setScent(double scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double h){
        super.setHeight(h);
        this.scent = super.getHeight() * 3;
    }
    
}
