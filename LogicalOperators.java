//Noreen Akhtar

package logicaloperators;

import java.util.Scanner;


public class LogicalOperators
{

   
    public static void main(String[] args)
    {
        int number;
        boolean divisibleBy5;
        boolean divisibleBy6;
        boolean divisibleBy5And6;
        boolean divisibleBy5Or6;
        boolean divisibleBy5Or6ButNotBoth;
        // Create Scanner
        Scanner inputOperator = new Scanner(System.in);
        
        // prompt the user to input an integer.
        
        System.out.print("Enter an integer: ");
        number = inputOperator.nextInt();
        
        //Divisibility check
        
         divisibleBy5 = (number % 5 == 0);
        divisibleBy6 = (number % 6 == 0);
        divisibleBy5And6 = divisibleBy5 && divisibleBy6;
        divisibleBy5Or6 = divisibleBy5 || divisibleBy6;
        divisibleBy5Or6ButNotBoth = divisibleBy5Or6 && !divisibleBy5And6;
        // Chceck if the number is divisible by 5 and 6
        if (divisibleBy5And6)
        {
            System.out.println(number + " is divisible by 5 and 6.");
        } else
        {
            System.out.println(number + " is not divisible by 5 and 6.");
        }
        
        //Check if the number is divisible by 5 or 6
        
        if (divisibleBy5Or6)
        {
            System.out.println(number + " is divisible by 5 or 6");
        } else
        {
            System.out.println(number + " is not divisible by 5 or 6");
        }
        // Check if the number is divisible by 5 and 6 but not both
        if (divisibleBy5Or6ButNotBoth)
        {
            System.out.println(number + " is divisible by 5 or 6 but not both");
        } else
        {
            System.out.println(number + " is not divisible by 5 or 6 but not both");
        }
        inputOperator.close();
    }
    
}
