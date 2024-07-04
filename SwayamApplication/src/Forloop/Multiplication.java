package Forloop;
//12*1=12
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		 int i,b;
		Scanner sc= new Scanner(System.in);
         System.out.println("Enter new number for table: ");
         b=sc.nextInt();
         
        
         for( i=1; i<=10; i++) {
        	 System.out.println(b+ "*" +i+ "=" + b*i);
//        	 b=12* i=1 =b*i(12*1=12)
         }
         
	}

}
