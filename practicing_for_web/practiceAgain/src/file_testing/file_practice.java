/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_testing;

import java.nio.file.*;
import java.io.*;
/**
 *
 * @author Adam Gutonski
 */
public class file_practice {
    
    public static void main(String[] args) {
        gamePlay newGame = new gamePlay();
        
        String[] keeper = newGame.getArray();
        int[] intArray = {1,2,3,4};
        
        for(int s: intArray){
            System.out.println(s);
        }
       
        for (String s: keeper) {
            System.out.println(s);
        }
    }
    
}
