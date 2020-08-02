import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* ���� 11728
 * ���ĵǾ��ִ� �� �迭 A�� B�� �־�����. �� �迭�� ��ģ ���� �����ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * <�Է�>
 * ù° �ٿ� �迭 A�� ũ�� N, �迭 B�� ũ�� M�� �־�����. (1 �� N, M �� 1,000,000)
 * ��° �ٿ��� �迭 A�� ������, ��° �ٿ��� �迭 B�� ������ �־�����. �迭�� ����ִ� ���� ������ 109���� �۰ų� ���� �����̴�.
 * 
 * <���>
 * ù° �ٿ� �� �迭�� ��ģ �� ������ ����� ����Ѵ�.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//System.out.print("�迭 A �� ũŰ : ");
		int a = sc.nextInt();
		//System.out.print("�迭 B �� ũŰ : ");
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
