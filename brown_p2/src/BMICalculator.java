
import java.util.Scanner;

public class BMICalculator // Declare public class BMICalculator
{
   private double weight; // Private instance methods
   private double height;
   private double bmi;
   private int sel;

   public void readUserData()
   {
       Scanner s = new Scanner(System.in);
       while (true) // Loop to verify user input 
       {
    	   System.out.println("\nPlease choose the formula respective to the units you wish to use.");
           System.out.println("1.Pounds/Inches.");
           System.out.println("2.Kilograms/Meters.");
           System.out.print("Enter Selection: ");
           sel = s.nextInt(); // Get user input for units       
           if (sel == 1) // Determine user units of measurement (lb/in)  
           {
               System.out.print("Enter weight in Pounds: ");
               weight = s.nextDouble(); // Set weight to user input
               if (weight < 0)
               {
            	   System.out.println("Error, weight cannot be negative!"); // if negative weight, reset
            	   continue;
               }

               System.out.print("Enter height in inches: ");
               height = s.nextDouble(); // Set height to user input
               if (height < 0)
               {
            	   System.out.println("Error, height cannot be negative!"); // if negative height, reset
            	   continue;
               }
               break;               
           } 
           
           if (sel == 2) // Determine user units of measurement (Kg/m)  
           {
               System.out.print("Enter weight in kilograms: ");
               weight = s.nextDouble(); // Set weight to user input
               if (weight < 0)
               {
            	   System.out.println("Error, weight cannot be negative!"); // if negative weight, reset
            	   continue;
               }

               System.out.print("Enter height in meters: ");
               height = s.nextDouble(); // Set height to user input
               if (height < 0)
               {
            	   System.out.println("Error, height cannot be negative!"); // if negative height, reset
            	   continue;
               }               
               break;               
           } 
           
           else 
           {
               System.out.println("Invalid selection."); // Reset if user doesnt enter 1 or 2
               continue;
           }
       }
       s.close(); // Close the scanner to not leak resources
   }

   public void calculateBmi() 
   {
       if (sel == 1)        
    	   bmi = (weight * 703) / (height * height); // Formula for Pounds/Inches               
       else 
    	   bmi = (weight) / (height * height); // Formula for Kilograms/Meters       
   }

   public void displayBmi() 
   {
       String category = ""; // BMI category selection (I used the expanded list which includes the categories of obesity, the ranges are the same. From "https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmi_dis.htm")
       if (bmi < 18.5)
           category = "Underweight";
       if (bmi >= 18.5 && bmi <= 24.9)
           category = "Normal";
       if (bmi >= 25 && bmi <= 29.9)
           category = "Overweight";
       if (bmi >= 30 && bmi <= 34.9)
           category = "Obese, class I";
       if (bmi >= 35 && bmi <= 39.9)
           category = "Obese, class II";
       if (bmi >= 40)
           category = "Extremeley Obese, class III";
       
       System.out.println("BMI: " + bmi); // Printing the BMI
       System.out.println("BMI Category: " + category); // Printing the BMI category

   }
}
