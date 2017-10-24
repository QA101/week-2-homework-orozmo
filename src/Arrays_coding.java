import java.util.*;
public class Arrays_coding {

	public static void main(String[] args) {
		/*
		1) Write a program, which takes an input as Integers of arrays, and print them.
	EX: input : int[] a ={1,2,3,4};
	Output:
	a [0] = 1
	a[1] =2
	a[2] =3
	a[3] = 4
            int [] a ={1,2,3,4};
 		
 		for(int i=0;i< 4; i++) {
 		System.out.println("a["+i+"] = "+a[i]);
 		
---------
2) Write a program which takes an input as Integers of arrays and prints in reverse
		 		order
		 		EX: input : int[] a ={1,2,3,4};
		 		Output:
		 		a [0] = 4
		 		a[1] =3
		 		a[2] =2
		 		a[3] = 1		 			

		int[] a= {1,2,3,4};
	    for (int i=3;i>=0;i--) {
			 System.out.println("a["+(-i+3)+"]="+ a[i]);
		
	    } 		
--------
3) Write a program which takes an input as Integers of arrays and it finds product
of all arrays.
EX: input : int[] a ={1,2,3,4};
Output: 1*2*3*4 = 24
		int [] a1= {1,2,3,4};
		 		System.out.println("Printing an array");
		 		
		 		for(int i=0;i<a1.length;i++) {
		 		System.out.println("array1["+i+"] =" + a1[i]);
		 		}
		 		
		 		System.out.println("Now printing in reverse");
		 		
		 		
		 		for(int j=a1.length-1;j>=0;j--) {
		 		
		 			System.out.println("a1["+j+"] =" + a1[j]);
		 			
		 		}
		 		
		 		int product=a1[0]*a1[1]*a1[2]*a1[3];
		 		System.out.println("Product of all elements is: " +product);
----------
4) Write a program which takes an input as doubles of arrays and print them.
EX: input: double[] a ={1.2, 2.5, 3.8, -12};
Output:
a [0] = 1.2
a[1] =2.5
a[2] =3.8
a[3] = -12
		 		
		
		double[] a= {1.2,2.5,3.8,-12};
		for (int i=0;i<4;i++) {
				 System.out.println("a["+i+"]="+ a[(int)i]);
		  }
---------
5) Write a program which takes an input as doubles of arrays and prints in reverse
order
EX: input: double[] a ={1.2, -20, 3.89, 400.0};
Output:
a [0] = 400.0
a[1] =3.89
a[2] = -20
a[3] = 1.2

		double[] a= {1.2,-20,3.89,400.0};
		 	
		 		for (int i=3;i>=0;i--) {
		 		System.out.println("a["+(-i+3)+"]="+ a[(int)i]);
		 	}
-----------
6) Write a program which takes an input as doubles of arrays and it finds product
of all arrays.
EX: input : double[] a ={1.0, 2.0, 3.89, 4.78};
Output: 1.0*2.0*3.89* 4.78= 37.1884

		double[] a= {1.0,2.0,3.89,4.78};
		double product=1;
				 
		for(double elements:a) {
		product*= elements;
					
		 		}
		 	System.out.println(a[0]+"*"+a[1]+"*"+a[2]+"*"+a[3]+"="+ product);
----------------
7) Write a program which takes an input as doubles of arrays and it finds average
of all arrays.

*/		
		Scanner console= new Scanner(System.in);
       System.out.print("No of index:" );
       int index= console.nextInt();
       double[] data =new double[index];
         
        double sum=0.0;
        for(int i=0;i<index;i++) {
   	   System.out.print("data ["+i+"]" + "=");
   	   data[i]=console.nextDouble();
   			   sum+= data[i];
           }
        double average= (double) sum /index;
        System.out.println("Average=" + average);
		      
	}
}
