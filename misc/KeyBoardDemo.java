/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12pg650;
import java.util.*;
import java.io.IOException;

/**
 *
 * @author techred3
 */
public class KeyBoardDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            //getRuntime().exec sends the String command to linux 
            //prompt...brings up keyboard.  do not need absolute paths?
            Process proc = Runtime.getRuntime().exec
                    ("onboard");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        String name;
        System.out.print("Enter name >> ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
