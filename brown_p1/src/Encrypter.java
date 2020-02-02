
public class Encrypter // Declare public class Encrypter
{   
   public String encrypt(String num) // Class method called encrypt
   {
       String enc = "";
       for(int i = 0 ; i < num.length() ; i++ ) // Loop for the math
       {
           int n = ((Integer.parseInt(num.charAt(i)+"")) + 7) % 10; // Adding 7 to the digit and getting the remainder after dividing the new value by 10
           enc = enc + n; // Adding the encrypted digits to string enc for scrambling
       }
       
       String encrypted = enc.charAt(2)+"" +enc.charAt(3)+"" +enc.charAt(0)+"" +enc.charAt(1)+""; // Scramble, swap the first digit with the third, and swap the second digit with the fourth
       return encrypted;     
   }
   
}
