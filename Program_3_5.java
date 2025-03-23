/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program_3;
// Problem 3.5: Write a program that prompts the user to enter an integer for todays' day of the week (Sunday: 0, Monday: 1.....)
// Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
/**
 *
 * @author icema
 */
public class Program_3_5 {
    public static void main(String args[]){
              
        // take user input for the date of the week
        Scanner input = new Scanner(System.in)
                
        // define variables to save the date of the week
        // take user input fr the future date of the week        
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        
        System.out.println("Enter the days that have been elapsed since today: " );
        int futureDate = input.nextInt():
        
        // Validate the user input
        if (today <0 || today >6){
            System.out.println("Invalisd Input! Day must be between 0 and 6");
            
        }
        
        // calculate the future day
        
        int futureDateElapsed (today + futureDay) % 7; // today = 1, futureDate = 51, (1+8)%7 = 2, Tuesday
        
        
        // determine the day of the week based on user input
        
        String dayName;
        String futureDayName;
        
        switch(today){
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;    
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;   
                
            default:
                System.out.println("Invalid Input! Day must be between 0 and 6");
                break;
                
        }
        
        System.out.println("The day of the today's date is " + dayName);
        System.out.println("The day of the today's date is " + futureDayName);
       
    }
}
