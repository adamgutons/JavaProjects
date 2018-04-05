/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author aorlichenko
 */
public class Exceptions {
    public static boolean quit = true;
    public static int QUIT_VAL = 99;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = {0,1,2,3};
        Scanner keyboard = new Scanner(System.in);
        printElement(arr, keyboard);
        //tryPrintElement(arr, keyboard);
        //tryPrintElement(arr, keyboard);
        /*
        try {
            methodThatThrows();
        } catch (MyException me) {
            System.out.println(me.getMessage());
            me.printStackTrace();
        }
        */
    }
    
    public static void tryPrintElement(int [] arr, Scanner keyboard) {
        
        try {
            printElement(arr, keyboard);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("The array index is out of bounds");
        } catch (InputMismatchException ime) {
            System.out.println("Not an integer");
            keyboard.nextLine();
        }
    }
    
    public static void printElement(int[] arr, Scanner keyboard) { 
        int i;
        while(quit){
            
            try{
            System.out.print("Which element of array do you want? ");
            i = keyboard.nextInt();
            if(i == QUIT_VAL){
                System.out.println("Thanks for trying!");
                System.exit(0);
            }
            System.out.println("The " + i + " element is " + arr[i]);
            
            }catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("The array index is out of bounds...");
            } catch (InputMismatchException ime) {
                System.out.println("Not an integer");
            
            }
        }
        }
    
    public static void methodThatThrows() throws MyException {
        throw new MyException();
    }
    
}
