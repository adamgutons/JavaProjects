/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam Gutonski
 */
import java.util.*;

public class gamePlay {
    
    private String paper = "paper";
    private String rock = "rock";
    private String scissors = "scissors";
    
    public String getRandomChoice(){
        final String[] choices = {paper, rock, scissors};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }
    
    
    public String getPaper(){
        return paper;
    }
    
    public String getRock(){
        return rock;
    }
    
    public String getScissors(){
        return scissors;
    }

    /**
     * @param paper the paper to set
     */
    public void setPaper(String paper) {
        this.paper = paper;
    }

    /**
     * @param rock the rock to set
     */
    public void setRock(String rock) {
        this.rock = rock;
    }

    /**
     * @param scissors the scissors to set
     */
    public void setScissors(String scissors) {
        this.scissors = scissors;
    }
            
    
}
