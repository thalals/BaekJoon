import java.util.Scanner;

/* ���� 10870
 * �Ǻ���ġ�� 5 ���
 * 
 * �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
 * �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
 * n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class �Ǻ���ġ_��� {

	public static void main(String[] args) {
		System.out.print("���ϰ��� �ϴ� n��° �Ǻ���ġ �� N : ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		System.out.println(pibo(n));
	}

	public static int pibo(int n) {
		int sum=0;
		
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else {
			return pibo(n-1)+pibo(n-2);
			//return sum;
		}
			
	}

}
