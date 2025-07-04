package first;

import java.util.ArrayList;
import java.util.Scanner;

public class B2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int a= s.nextInt();
int result=0;
for(int i=0;i<a;i++) {
	
	int sum=0;
	int number=i;
	while(number!=0) {
		sum+=number%10;
		number/=10;
	}
	if(sum+i==a) {
		result=i;
		break;
	}
}
System.out.println(result);

	}

}
