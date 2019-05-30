package bowlingGame;

/**
* @Player class
* @author Md Ahsanul Hoque
* @since 20190204
*/
public class Player {
    private String name;
    private int totalScore;
    
    public Player(){}
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the totalScore
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
