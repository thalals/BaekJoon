
/* BOJ 2448��
 * ù° �ٿ� N�� �־�����. N�� �׻� 3��2^k ���̴�. (3, 6, 12, 24, 48, ...) (k �� 10)
 * 
 * ����
 */
import java.util.*;

public class StarTree {

	public static void main(String[] args) {
		System.out.print("n��° �ٱ��� ��� : ");
		Scanner sc = new Scanner(System.in);
		int n;
		int j = 1;
		int od = 1;
		/*---------------------------------------*/
		while (true) { // �Է�
			n = sc.nextInt();

			if (n == 3)
				break;
			else if (n % 6 != 0) {
				System.out.print("N�� �׻� 3��2^k ������ �մϴ�.�ٽ� �Է��ϼ��� ");
			} else
				break;
		}
		for (int i = 1; i < n / 6; i++)
			od = od + (int) Math.pow(2, i); // �̰žƴ�

		// n =3 �϶� �׸���
		/*---------------------------------------*/
		if (n == 3) {
			for (int i = 1; i < n; i++)
				System.out.print(" ");
			System.out.println("*");

			for (int i = 0; i < n % 2; i++) {
				System.out.print(" *");
				System.out.print("  *\n");
			}
			for (int i = 0; i < 6; i++)
				System.out.print("*");
		}

		/*---------------------------------------*/
		while (j <= n) {
			if (j % 3 == 0) {
				for (int i = 1; i < (n * n / 6)/j + od; i++) // ����� �߾���
					System.out.print(" ");
				System.out.println("*");
			}
			for (int i = 1; i < (n * n / 6) + od; i++) // ����� �߾���
				System.out.print(" ");
			System.out.println("*");
			j++;
			
			for (int i = 1; i < n + od; i++)
				System.out.print(" ");
			System.out.println("*");
		}

	}
}
