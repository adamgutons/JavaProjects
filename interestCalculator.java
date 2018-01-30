/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam.gutonski
 */

import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        
        double loanAmount;
        double intRate;
        int payments;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Interest Payment calculator!");
        System.out.println("Enter loan amount:");
        loanAmount = sc.nextDouble();
        System.out.println("Enter yearly interest rate:");
        intRate = (sc.nextDouble()/100);
        System.out.println("Enter years on the loan:");
        payments = sc.nextInt();
        System.out.println("Calculating payment...");
        System.out.println("Monthly payment = " + calcRate(loanAmount, intRate, payments));
    }
 
      public static double calcRate (double loanAmount, double rate, int payments){
          double monthlyRate = (rate / 12);
          System.out.println("Monthly rate= " + monthlyRate);
          double months = (payments * 12);
          System.out.println("Months = " + months);
          double power = Math.pow(1 + monthlyRate, months);
          System.out.println("Test = " + power);
          double answer;
          answer = (loanAmount * monthlyRate)/(1 - (1 / power));
          return answer;
      }
}
