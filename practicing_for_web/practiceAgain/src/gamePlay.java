

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
    
    private final String paper = "paper";
    private final String rock = "rock";
    private final String scissors = "scissors";
    private final String[] wordArray = {"rock", "paper", "scissors"};
    
    public String getRandomChoice(){
        Random random = new Random();
        int index = random.nextInt(wordArray.length);
        return wordArray[index];
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
    
}
