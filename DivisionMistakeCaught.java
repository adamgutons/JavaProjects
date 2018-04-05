/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivisionExceptionHandling;
import java.util.*;
/**
 *
 * @author techred3
 * HOLY SHIT IT WORKS!! THIS PROGRAM DEMONSTRATES A WHILE LOOP AND EXCEPTION
 * HANDLING OF 2 USER INPUT VARIABLES
 */

public class DivisionMistakeCaught {
    public static Scanner sc = new Scanner(System.in);
    public static int numerator;
    public static int denominator;
    public static int quotient;
    public static final int EXIT_VAL = 00;
    public static boolean quit = true;
    
    public static void main(String[] args) {
        //Scanner kb = new Scanner(System.in);
        gatherInput();
    }        
    
    public static void gatherInput() {
        //int numerator;
        //int denominator;
        //int quotient;
        boolean exit = true;
        
        while(quit){
           try{
               System.out.print("Enter numerator >> (00 to quit) ");
                numerator = sc.nextInt();
                quit = false;
                //System.out.println(numerator);
                
                //sc.nextInt();
                if(numerator == EXIT_VAL){
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                
                sc.nextLine();
            } catch (InputMismatchException ime){
                    System.out.println("Mismatch...");
                    sc.nextLine();
                } catch (ArithmeticException ae){
                    System.out.println("Bad expression...");
                }
        }
        
        while(exit){
            try{
                
                System.out.print("Enter denom (00 to quit) >>");
                denominator = sc.nextInt();
                if(denominator == EXIT_VAL){
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                quotient = (numerator / denominator);
                System.out.println(numerator + " / " + denominator + " = " + quotient);
                //System.exit(0);
                //System.out.println("Enter denominator >> (00 to quit) ");  
                //denominator = sc.nextInt();
                //quotient = (numerator/denominator);
                } catch (InputMismatchException ime){
                    System.out.println("Mismatch...");
                    sc.nextLine();
                } catch (ArithmeticException ae){
                    System.out.println("Bad expression...");
                }
        }
        
            //sc.nextLine();
            
            /*
            try{
                System.out.println("Enter denom >>");
                denominator = sc.nextInt();
                quit = false;
                //exit = false;    
                } catch (InputMismatchException ime){
                    System.out.println("Mismatch...");
                } catch (ArithmeticException ae){
                    System.out.println("Bad expression...");
                }
            */
        }
            //quotient = (numerator/denominator);
            //System.out.println(quotient);
            
        

    }
    
    
    
    

