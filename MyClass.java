/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci.pkg2350.elearn2_2025;
// Problem 3.4: Write a Java Program that randomly generates an integer between 1 and 12 and displays the English month
// February for numbers like 1,2.....12
// We are required to use switch cases
/**
 *
 * @author icema
 */
public class MyClass {
    public static void main(String args[])
    {
        // Generate a random number from 1 to 12
        int monthNumber = (int)(Math.random() * 12) + 1;
        
        // Get a variable to store the month name
        String monthName;
        // Determine the month name using switch cases
        
        switch(monthNumber){
            
            case 1:
                monthName = "January";
                break;
                
            case 2:
                monthName = "February";
                break;
              
            case 3:
                monthName = "March";
                break;    
                
            case 4:
                monthName = "April";
                break;    
                
            case 5:
                monthName = "May";
                break;    
                
            case 6:
                monthName = "June";
                break;    
                
            case 7:
                monthName = "July";
                break;    
                
            case 8:
                monthName = "August";
                break;    
                
            case 9:
                monthName = "September";
                break;    
                
            case 10:
                monthName = "October";
                break;  
                
            case 11:
                monthName = "November";
                break;    
                
            case 12:
                monthName = "December";
                break;    
                
            default:
                monthName = "Invalid Month Number";
                break;
        }
        System.out.println ("The random generated month number is: " + monthNumber);
        System.out.println("The month name is: " + monthName);
    }
}
