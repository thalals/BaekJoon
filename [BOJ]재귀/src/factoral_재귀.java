import java.util.*;

/* 백준 10872 
 * 팩토리얼  재귀
 * 
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * <입력>
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 * 
 */
public class factoral_재귀 {
	public static void main(String[] args) {
		System.out.print("N 입력 : ");
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
