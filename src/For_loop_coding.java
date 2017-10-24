import java.util.Scanner;

public class For_loop_coding {
	public static void main(String[] args) {
	/*FOR LOOPS Coding exercises:

		Write a program using FOR loop to print following outputs:
1
12
123
1234

	
		Scanner input = new Scanner (System.in);
		int i, j;
		
		for (i = 0; i <= 4; i++)
		{
		for (j = 1; j <= i; j++)
		{
			System.out.print(j);
		}
		System.out.println();
		}
		
--------------
1
2 2 2
3 3 3 3 3
4 4 4 4 4 4 4		
		
		int k = 3;
		for(int i = 0; i <= 4; i++)
		{
		for(int j = 1; j < i*2; j++)
		{
		System.out.print(" "+i);

		}
		k += i;
		System.out.println(" ");
		}
		
-------------
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7 8


		
       int k = 3;
       for (int i = 2; i <= 4; i++)
       {
       for (int j = 1; j <= k; j++) 
       {
      System.out.print(j);
        }
       k += i;
      System.out.println();

       }
-------------
* *
* * * *
* * * * * *
* * * * * * * *

		int k = 3;
		for(int i = 0; i <= 4; i++)
		{
		for(int j = 0; j < i*2; j++)
		{
		System.out.print("*");

		}
		k += i;
		System.out.println(" ");
		}
----------
$
$ $ $
$ $ $ $ $
$ $ $ $ $ $ $

		int k = 3;
		for(int i = 0; i <= 4; i++)
		{
		for(int j = 1; j < i*2; j++)
		{
		System.out.print("$");

		}
		k += i;
		System.out.println(" ");
		}
------------------
2
2 2
2 2 2
2 2 2 2

		int i, j;
		for (i = 0; i <= 4; i++)
		{
		for (j = 1; j <= i; j++)
		{
			System.out.print("2");
		}
		System.out.println();
		}
-------
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *	
*/
		for(int r = 0; r < 4; r++)
        {
        System.out.print(" ");
        for(int c = 0; c < 7; c++)
        {
         System.out.print("*");
        }
         System.out.println();
        }
		
		
	
	}
	

}
