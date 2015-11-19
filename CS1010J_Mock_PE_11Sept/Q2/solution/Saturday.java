/*
 * CS1010J AY2014/5 Semester 1
 * Mock-PE1 Ex2: Saturday.java
 * 
 * This program reads day and month of a Monday and computes
 * the day and month of next Saturday.
 * 
 * Author: Lifeng
 */

import java.util.*;

class Saturday {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the date of a Monday in 2014 <month day>: ");
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        int saturday = day + 5;
        
        if ( (month == 1 || month == 3 || month == 5 || month == 7 ||
              month == 8 || month == 10 || month == 12) && saturday > 31) {
            saturday -= 31;
            month++;
        }
        else if ( month == 2 && saturday > 28 ) {
            saturday -= 28;
            month++;
        }
        else if ( (month == 4 || month == 6 || month == 9 || month == 11) && saturday > 30 ) {
            saturday -= 30;
            month++;
        }
        
        printDate(month, saturday);
    }
    
// Print date in the required format
    public static void printDate(int month, int day) {
        
        System.out.print("Saturday in that week is: ");
        
        switch (month) {
            case 1: System.out.println("January " + day); break;
            case 2: System.out.println("February " + day); break;
            case 3: System.out.println("March " + day); break;
            case 4: System.out.println("April " + day); break;
            case 5: System.out.println("May " + day); break;
            case 6: System.out.println("June " + day); break;
            case 7: System.out.println("July " + day); break;
            case 8: System.out.println("August " + day); break;
            case 9: System.out.println("September " + day); break;
            case 10: System.out.println("October " + day); break;
            case 11: System.out.println("November " + day); break;
            case 12: System.out.println("December " + day); break;
        }
    }
}