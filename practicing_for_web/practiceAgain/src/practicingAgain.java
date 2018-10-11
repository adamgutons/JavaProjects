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

public class practicingAgain {
    
    public static void main(String[] args) {
        /*
        final String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        System.out.println(choices[index]);
        */
        boolean startGame = true;
        String quitGame = "quit";
        int counter = 0;
        gamePlay newGame = new gamePlay();
        Scanner sc = new Scanner(System.in);
        
        
        while(startGame){
            counter += 1;
            String computerChoice = newGame.getRandomChoice();
            System.out.println("Rock paper scissors?");
            String userChoice = sc.nextLine();
            System.out.println();
            
            if (userChoice.equals(computerChoice)) {
            System.out.println("Game " + counter + " Choices match!");
            System.out.println("User selects " + userChoice);
            System.out.println("Computer selects " + computerChoice);
            System.out.println();
            continue;
            }
            
            if (userChoice.equals(newGame.getRock())){
                if(computerChoice.equals(newGame.getScissors())){
                    System.out.println("Game " + counter + " User wins!");
                    System.out.println("User selects " + userChoice);
                    System.out.println("Computer selects " + computerChoice);
                    System.out.println();
                } 
                else {
                    System.out.println("Game " + counter + " Computer wins!");
                    System.out.println("User selects " + userChoice);
                    System.out.println("Computer selects " + computerChoice);
                    System.out.println();
                }
            }    
                
            if(userChoice.equals(newGame.getPaper())){
                if(computerChoice.equals(newGame.getRock())){
                    System.out.println("Game " + counter + " User wins!");
                    System.out.println("User selects " + userChoice);
                    System.out.println("Computer selects " + computerChoice);
                    System.out.println();
                } 
                else {
                    System.out.println("Game " + counter + " Computer wins!"); 
                    System.out.println("User selects " + userChoice);
                    System.out.println("Computer selects " + computerChoice);
                    System.out.println();
                }
            }
                
            if (userChoice.equals(newGame.getScissors())){
                if(computerChoice.equals(newGame.getPaper())){
                    System.out.println("Game " + counter + " User wins!");
                    System.out.println("User selects " + userChoice);
                    System.out.println("Computer selects " + computerChoice);
                    System.out.println();
                } 
                else {
                    System.out.println("Game " + counter + " Computer wins!"); 
                    System.out.println("User selects " + userChoice);
                    System.out.println("Computer selects " + computerChoice);
                    System.out.println();
                }
                
            }
            
            if (userChoice.equals(quitGame)){
                startGame = false;
            }
                
        }//close while  */
    }//close main
}//close class
