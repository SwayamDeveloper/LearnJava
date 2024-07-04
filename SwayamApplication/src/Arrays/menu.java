package Arrays;

import java.util.Arrays;

public class menu {
public static void main(String[] args) {
	int age = 30;
	int physics=97;
	int chemistry = 98;
	int biology = 95;
	
	int[] marks = new int[3];
	marks[0] = 97;
	marks[1] = 98;
	marks[2] = 95;
	
//	System.out.println(marks[0] + marks[1]);
	
//	System.out.println(marks.length);
	
	
//	sort
	
	System.out.println(marks[0]);
	Arrays.sort(marks);
	System.out.println(marks[0]);
}
}
