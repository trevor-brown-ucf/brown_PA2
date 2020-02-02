
import java.util.Scanner;

public class Application // Declare public class Application
{
   public static void main(String[] args) // Application main method
   {
       Scanner s = new Scanner(System.in); 
       System.out.print("Please enter a four digit integer: ");      
       String num = s.nextLine(); // Get user input into a string
       s.close(); // Close the scanner to not leak resources
       if(num.length() != 4) // Make sure it's 4 digits, it will use only 4 digits regardless but this is for neatness
       {
           System.out.println("Invalid input."); 
           return; // Stops the program before the math if input > 4       
       }  
       
       Encrypter Encrypter = new Encrypter();
       String enc = Encrypter.encrypt(num); // Encrypt the number using Encrypter.encrypt     
       System.out.println( "Encrypted: "+enc); // Display the encrypted value to standard output       
       
       Decrypter Decrypter = new Decrypter();       
       String dec = Decrypter.decrypt(enc); // Decrypt the number using Decrypter.decypt       
       System.out.println("Decrypted: "+dec); // Display the decrypted value to standard output
   }

}