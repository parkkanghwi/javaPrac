package first;

import java.util.Scanner;

public class S9086 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	String name[]=new String[a];
	for(int i=0;i<a;i++) {
		String b= s.next();
		name[i]=b.substring(0,1)+b.substring(b.length()-1, b.length());
	}
	for(int i=0;i<a;i++) {
		System.out.println(name[i]);
	}
}
}
