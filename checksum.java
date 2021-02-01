import java.util.Scanner;

public class checksum {
  
   public static void main(String args[]) {

       final int max_int = 255; // The maximum size for the input
       int count ((number >> 8) & 0x0F)*2; // The number of integers to read from stdin
       int sum = 0; // Note that the "sum" might exceed max_int
       int checksum = 0; // The value of the 6th input integer
       int quotient; // The result of evaluating the assignment: quotient = sum / (max_int + 1);
       int remainder; // The result of evaluating the assignment: remainder = sum % (max_int + 1 );
       int complement; // The result of evaluating the assignment: complement = max_int - sum;

       Scanner stdin = new Scanner(System.in);

       while(count > 0)
       {
           int value = stdin.nextInt(); 
           if(value >= 0 && value <= max_int)
           {
          
               if(count == 5)                
               {
                   checksum = value;                 
                    
                                          value = 0;                }
              
               sum += value; 
               count--; 
           }
       }
      
       quotient = sum/(max_int + 1);
       remainder = sum%(max_int + 1);
              sum = quotient + remainder;
              complement = max_int-sum;
      
       System.out.printf("Stored Checksum: %d, Computed Checksum: %d\n", checksum, complement);
       if (checksum != complement ) {
       System.err.printf("Error Detected!\n");
       }
      
   }

}