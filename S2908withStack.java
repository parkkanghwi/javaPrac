package first;

import java.util.Scanner;
import java.util.Stack;

public class S2908withStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
String a= s.next();
String b= s.next();
Stack<Character> c= new Stack<Character>();
Stack<Character> d= new Stack<Character>();
for(char k:a.toCharArray()) c.push(k);
for(char k:b.toCharArray()) d.push(k);
String e= "";
String f= "";
while(!c.isEmpty()) e+=c.pop();
while(!d.isEmpty()) f+=d.pop();
int numA= Integer.parseInt(e);
int numB = Integer.parseInt(f);
System.out.println(numA>numB?numA:numB);
	}

}
