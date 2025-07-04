package first;

import java.util.Scanner;

public class B2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int N= s.nextInt();
int M= s.nextInt();
int[] a= new int[N];
for(int i=0;i<N;i++) {
	a[i]=s.nextInt();
}
int result=search(a,N,M);
System.out.println(result);
	}
	
	static int search(int[] arr,int N, int M) {
		int result=0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1; j<N-1;j++) {
				for(int k=j+1; k<N;k++) {
					int temp= arr[i]+arr[j]+arr[k];
					
					if(temp==M) return temp;
					if(result<temp&&temp<M) {
						result=temp;
						
					}
				}
				
			}
		} return result;
	}

}
