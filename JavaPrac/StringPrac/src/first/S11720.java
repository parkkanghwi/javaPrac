package first;

import java.util.Scanner;

public class S11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int a= s.nextInt();
String b= s.next();
int c=0;
for(int i=0;i<b.length();i++) {
c+=b.charAt(i)-'0';
}
System.out.println(c);
	}

}
