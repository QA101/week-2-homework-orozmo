import java.util.Scanner;
public class Advanced_arrays {

	public static void main(String[] args) {
/*
		1)Write a program which takes as input 1D- array and finds maximum number , itâ€™s
	index value.		

		int arr_size = 0;
		int max=0;
		int maxindex=0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
        int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
		  {
    	arr[i]=in.nextInt();
	      }
	    max=arr[0];
        for (int i=0;i<(arr_size);i++)
		   {
	   	if(max<arr[i])
		  	{
	    		max=arr[i];
		  		maxindex=i;
		   	}
	    }
	     System.out.println(max);
	     System.out.println(maxindex);
		    in.close();
----------

 2)Write a program which takes as input 1D- array and finds minimum number, it’s
 index value.

 	
 		int arr_size = 0;
 		int min=0;
 		int minindex=0;
 		Scanner in = new Scanner(System.in);
 	    arr_size=in.nextInt();
 	    int arr[] = new int[arr_size];
 	    for (int i=0;i<arr_size;i++)
 	    {
 	    	arr[i]=in.nextInt();
 	    	
 	    }
 	    min=arr[0];
 	    for (int i=0;i<(arr_size);i++)
 	    {
 	    	if(min>arr[i])
 	    	{
 	    		min=arr[i];
 	    		minindex=i;
 	    	}
 	    }
 	    System.out.println(min);
 	    System.out.println(minindex);
 	    in.close();		    
---------

3) Write a program which takes as input 2D- array and finds maximum number , it's
index value.
*/
		double[][] my2Array = new double[][]{
			  { 3.5, 1.5, 2.0, 4.6, 7.0},
			  { 0, 0, 14.7, 2.25, 5.0 },
			  { 13.3, -77.9, 18.4, -9.32, 12.6}
			  };
						 
					
			 	double max3 = my2Array[0][0];
			 	int index3[] = new int [2];
					for (int i = 0; i < my2Array.length; i++) {
			        for (int j = 0; j < my2Array[i].length; j++) {
			        	       if (my2Array[i][j] > max3) {
		 					max3 = my2Array[i][j];
				 					index3[0] = i;
				 					index3[1] = j;
			 					}
				        	       
			 		}
				}
						
		        System.out.print ("Task 3. Maximum number is: "+ max3 + "; ");
		        System.out.println ("index is: "+ Arrays.toString(index3));
		
	}

}
