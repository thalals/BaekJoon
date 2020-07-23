
/* 백준 2447 별찍기 10 재귀
 * 재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
 * 크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
 * 
 * 배열로 풀이, 3^8 = 6561;
 */
import java.util.*;

public class 별찍기10_재귀 {
	static char arr[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count =1 ;
		while (true) {
			System.out.print("N(3의 거듭제곱) : ");
			n = sc.nextInt();
			if (n % 3 != 0 || n>6561)
				System.out.println("n은 3의 거듭제곱수여야 합니다 혹은 수를 낮추세요");
			else
				break;
		}
		
		char arr[][] = new char[n][n];		//동적할당
		init();
		
		draw(0,0,n);
		
	}
	
	/*--------------------------------------------------------*/ 
	public static void init() { 			//초기화
		for(int i =0; i<arr.length;i++)		//행.length
			for(int j=0;j<arr[0].length;j++)	//열.length
				arr[i][j] = ' ';
	}
	
	/*---------------------------------------------------*/
	public static void draw(int x, int y, int n) {
		if(n==0) {
			arr[x][y] ='*';
		}
		
		for(int i =0;i<3;i++)
			for(int j=0;j<3;j++) {
				if(i==1&&j==1)	//가운데 구멍
					continue;
				
				draw(x+(n/3)*i,y+(n/3)*j,n/3);
			}
	}// * * *
	 // *   *
	 // * * *

}
