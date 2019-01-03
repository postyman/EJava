package chapter3;

import java.util.Scanner;

public class PrimeFactorizationAaron {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer to find all of its factors.");
        int num = input.nextInt();
        for(int i = 2; i<=num; i++)
        {
               if(num%i==0)
               {
                     System.out.print(i);
                     num = num/i;
                     i=1;
                     if(num!=i)
                            System.out.print(" * ");
                            
               }
        }
        input.close();

	}

}
