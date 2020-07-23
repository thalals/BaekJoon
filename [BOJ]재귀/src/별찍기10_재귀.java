
/* ���� 2447 ����� 10 ���
 * ������� �������� ���� ��� ����. N�� 3�� �ŵ�����(3, 9, 27, ...)�̶�� �� ��, ũ�� N�� ������ N��N ���簢�� ����̴�.
 * ũ�� 3�� ������ ����� ������ �ְ�, ����� ������ ��� ĭ�� ���� �ϳ��� �ִ� �����̴�.
 * 
 * �迭�� Ǯ��, 3^8 = 6561;
 */
import java.util.*;

public class �����10_��� {
	static char arr[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count =1 ;
		while (true) {
			System.out.print("N(3�� �ŵ�����) : ");
			n = sc.nextInt();
			if (n % 3 != 0 || n>6561)
				System.out.println("n�� 3�� �ŵ����������� �մϴ� Ȥ�� ���� ���߼���");
			else
				break;
		}
		
		char arr[][] = new char[n][n];		//�����Ҵ�
		init();
		
		draw(0,0,n);
		
	}
	
	/*--------------------------------------------------------*/ 
	public static void init() { 			//�ʱ�ȭ
		for(int i =0; i<arr.length;i++)		//��.length
			for(int j=0;j<arr[0].length;j++)	//��.length
				arr[i][j] = ' ';
	}
	
	/*---------------------------------------------------*/
	public static void draw(int x, int y, int n) {
		if(n==0) {
			arr[x][y] ='*';
		}
		
		for(int i =0;i<3;i++)
			for(int j=0;j<3;j++) {
				if(i==1&&j==1)	//��� ����
					continue;
				
				draw(x+(n/3)*i,y+(n/3)*j,n/3);
			}
	}// * * *
	 // *   *
	 // * * *

}
