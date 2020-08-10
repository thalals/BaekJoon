import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 n과m 4번 (15652번)
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 
 * -> 같은 수를 여러 번 골라도 된다.
 * -> 고른 수열은 비내림차순이어야 한다
 * 
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * 
 */
public class N_and_M4_Main {
	private static boolean visit[];
	private static int n,m;
	private static int a[];
	static StringBuilder sb = new StringBuilder();		//시간초과 해결
	
	//Main
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n];
		a = new int[m];
		
		solve(0,0);
		System.out.println(sb);
	}
	
	//Solve
	public static void solve(int count,int index) {
		//종료조건 -출력
		if(count==m) {
			for(int i=0;i<m;i++)
				sb.append(a[i]+" ");
			sb.append("\n");	
			
			return;
		}
		
		//index를 값으로 가지므로 반복문이 돌수록 a[]에 들어가는 수가 증가하여 시작
		for(int i=index;i<n;i++) {
			
			a[count]=i+1;
			solve(count+1,i);
		}
	}
}