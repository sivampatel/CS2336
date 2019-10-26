import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryToDecimal{

  // You can add more methods
    public static boolean checkforBinary(String s)
    {  
        for(int x = 0; x < s.length(); x++)
        {
            if(s.charAt(x) != '1' && s.charAt(x) != '0')
                return false;
        }
        return true;
    }
    
    public static int binaryToDecimal(String binaryString){
        if(!checkforBinary(binaryString))
            return Integer.parseInt(binaryString);
        if(binaryString.length() == 1)
            return Character.getNumericValue(binaryString.charAt(0));
        else
        {
            return (Character.getNumericValue(binaryString.charAt(0)) 
                    * (int)Math.pow(2, binaryString.length() - 1)) 
                    + binaryToDecimal(binaryString.substring(1));
        }
		
	}
}
class DriverMain{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        System.out.print(BinaryToDecimal.binaryToDecimal(input.nextLine()));
	}
}

