
/* BOJ 2448번
 * 첫째 줄에 N이 주어진다. N은 항상 3×2^k 수이다. (3, 6, 12, 24, 48, ...) (k ≤ 10)
 * 
 * 수정
 */
import java.util.*;

public class StarTree {

	public static void main(String[] args) {
		System.out.print("n번째 줄까지 출력 : ");
		Scanner sc = new Scanner(System.in);
		int n;
		int j = 1;
		int od = 1;
		/*---------------------------------------*/
		while (true) { // 입력
			n = sc.nextInt();

			if (n == 3)
				break;
			else if (n % 6 != 0) {
				System.out.print("N은 항상 3×2^k 수여야 합니다.다시 입력하세요 ");
			} else
				break;
		}
		for (int i = 1; i < n / 6; i++)
			od = od + (int) Math.pow(2, i); // 이거아님

		// n =3 일때 그리기
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
				for (int i = 1; i < (n * n / 6)/j + od; i++) // 꼭대기 중앙점
					System.out.print(" ");
				System.out.println("*");
			}
			for (int i = 1; i < (n * n / 6) + od; i++) // 꼭대기 중앙점
				System.out.print(" ");
			System.out.println("*");
			j++;
			
			for (int i = 1; i < n + od; i++)
				System.out.print(" ");
			System.out.println("*");
		}

	}
}
