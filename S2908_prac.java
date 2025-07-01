package first;

import java.util.Scanner;
import java.util.Stack;

public class S2908_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
String a= s.nextLine();
Stack<Character> b= new Stack<Character>();
for(char c:a.toCharArray()) b.push(c);
while(!b.isEmpty()) System.out.println(b.pop());
	}

}
