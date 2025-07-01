package first;

import java.util.Scanner;

public class S1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
String a= s.nextLine();
a= a.trim();
if(a.isEmpty()) System.out.println("0");
else {
	String[] word= a.split("\\s++");
	System.out.print(word.length);
}
	}
}