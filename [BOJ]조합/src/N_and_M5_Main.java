import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 백준 n과m 5번 (15654번)
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * N개의 자연수는 모두 다른 수이다.
 * 
 * -> 첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * -> 둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.
 * 
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * 
 */
public class N_and_M5_Main {
	private static boolean visit[];
	private static int n,m;
	private static int a[];
	private static int b[];
	static StringBuilder sb = new StringBuilder();		//시간초과 해결
	
	//Main
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n];
		a = new int[n];
		b = new int[n];
		
		String str1[] = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
			b[i] = Integer.parseInt(str1[i]);
		Arrays.sort(b);
		
		solve(0);
		System.out.println(sb);
	}
	
	//Solve
	public static void solve(int count) {
		//종료조건 - 출력
		if(count==m) {
			for(int i=0;i<m;i++)
				sb.append(a[i]+" ");
			sb.append("\n");	
			
			return;
		}
		
		//index를 값으로 가지므로 반복문이 돌수록 a[]에 들어가는 수가 증가하여 시작
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				a[count]=b[i];
				solve(count+1);	
				visit[i] = false;
			}
		}
	}
}