package first;

import java.util.Scanner;

public class S10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
String a= s.next();
int b[]=new int[26];
for(int i=0;i<b.length;i++) {
	b[i]=-1;
}
for(int i=0;i<a.length();i++) {
	char c=a.charAt(i);
	if(b[c-'a']==-1) {
		b[c-'a']=i;
	}
}
for(int i:b) {
	System.out.print(i+" ");
}
	}

}
