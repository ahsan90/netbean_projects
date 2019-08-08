/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosugarsmash;
//import java.util;

import java.util.List;

/**
 *
 * @author Ahsan
 * @since 20190808
 * 
 */
public class PremiumSugarSmashPlayer extends SugarSmashPlayer{
    
    public PremiumSugarSmashPlayer(){
        super();
    }
    
    private int level = super.SCORE_SIZE + 40;
    private int[] scores = new int[level-1];
    

    @Override
    public int getScore(int level) {
        return scores[level];
    }

    @Override
    public int setScore(int score, int level) {
        this.scores[level] = score;
        return 0;
    }
    
    
    
}
