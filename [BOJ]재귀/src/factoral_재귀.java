import java.util.*;

/* ���� 10872 
 * ���丮��  ���
 * 
 * 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * <�Է�>
 * ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
 * 
 */
public class factoral_��� {
	public static void main(String[] args) {
		System.out.print("N �Է� : ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(factorial(n));
	}

	public static int factorial(int n) {
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
