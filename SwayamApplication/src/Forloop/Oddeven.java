package Forloop;
//Odd even using for loop with if condition
public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("odd"+"\teven");
		int i,j;
       for(i=1; i<=10; i++) {
    	   if(i%2 == 0) {
    		   System.out.println(i+" ");
    	   }
    	   else {
    		   System.out.print(i+"\t");  
    	   }
       }
	}

}
