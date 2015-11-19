/*
 * CS1010J AY2014/5 Semester 1
 * Mock-PE1 Ex1: Tax.java
 * 
 * This program reads income and computes the income tax.
 * 
 * Author: Lifeng
 */

import java.util.*;
import java.text.*;

class Tax {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        
        double tax = computeTax(income);
        
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Your tax payable is: " + df.format(tax));
    }
    
    // Compute the tax payabe for given income
    public static double computeTax(double income) {
        
        if (income <= 20000)
            return 0;
        else if (income <= 30000)
            return (income - 20000) * 0.03;
        else if (income <= 80000)
            return 300 + (income - 30000) * 0.06;
        else  // income > 80000
            return 3300 + (income - 80000) * 0.1;
    }
}