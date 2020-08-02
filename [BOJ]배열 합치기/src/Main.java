import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 백준 11728
 * 정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.
 * 
 * <입력>
 * 첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
 * 둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.
 * 
 * <출력>
 * 첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//System.out.print("배열 A 의 크키 : ");
		int a = sc.nextInt();
		//System.out.print("배열 B 의 크키 : ");
		int b = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		String input1[] = br.readLine().split(" ");
		int A[]=new int[a];
		int B[] = new int [b];
		for(int i=0;i<A.length;i++) {
			A[i] = Integer.parseInt(input[i]);
			B[i] = Integer.parseInt(input1[i]);
		}
		
		int C[] = new int [a+b];
		
		for(int i=0;i<a;i++) {
			C[i]=A[i];
		}
			
		
		for(int i=0;i<b;i++) {
			C[i+a]=B[i];
		}
		
		Arrays.sort(C);
		
		for(int i=0; i < a+b ;i++) {
			System.out.print(C[i]+" ");
		}
			
	}

}
