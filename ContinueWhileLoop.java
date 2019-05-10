package com.ContinueWhileLoop;

public class ContinueWhileLoop {
	
	 public static void main(String args[])
	   {
	      int i=0;

	     loop: while(i<=10)
	      {
	          if(i%2==0)
	         {
	                    i++;              // We've to mention it here, otherwise the while loop  iteration will stop
	                    continue loop;
	          }

	          System.out.print(i+" ");
	           i++;
	      }

	   }

}
