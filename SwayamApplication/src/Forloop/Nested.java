package Forloop;
//Nested for loop 1 to 10 table
import java.util.*;
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Multiplicatio number : ");
//		sc.next();
       
		
       
	for(i=1; i<=10; i++) { //outer loop
    	   	for(j=1; j<=10; j++) { //inner loop
    		   System.out.print(j + " * " + i + " = " + j * i);
    	   }
    	   System.out.println();
       }
	}

}
