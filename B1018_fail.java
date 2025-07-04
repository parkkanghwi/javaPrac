package first;

import java.util.Scanner;

public class B1018_fail {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		s.nextLine();
		int sum=0;
		char[][] a= new char[N][M];
		for(int i=0;i<N;i++) {
			String line =s.nextLine();
			for(int j=0;j<M;j++) {
				a[i][j]=line.charAt(j);
			}
		}
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				for(int dir=0;dir<4;dir++) {
					int ni=i+dx[dir];
					int nj=j+dy[dir];
					
					if(ni>=0&&ni<N&&nj>=0&&nj<M) {
						if(a[i][j]==a[ni][nj]) sum++;
					}
				}
			}
		}
		System.out.println(sum);

	}

}
