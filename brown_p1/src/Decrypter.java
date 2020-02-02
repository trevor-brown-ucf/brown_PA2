
public class Decrypter // Declare public class Decrypter
{
   public String decrypt(String num) // Class method called decrypt
   {
       String dec = "";       
       for(int i = 0 ; i < num.length() ; i++ ) // Loop for the math
       {          
           int n = ((Integer.parseInt(num.charAt(i)+"")) - 7) ; // Start by subtracting each digit by 7           
           if (n < 0) // then add 10 if n < 10
               n += 10;
           dec = dec + n; // Adding the decrypted digits to string dec to be unscrambled
       }
       
       String decrypted = dec.charAt(2) +""+ dec.charAt(3)+"" + dec.charAt(0)+""+ dec.charAt(1)+""; // Unscramble, swap the first digit with the third, and swap the second digit with the fourth
       return decrypted;      
   }
   
}