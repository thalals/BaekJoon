import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 n과m 1번 (15649번)
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * ->고른 수열은 오름차순이어야 한다.
 * 
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * 
 */
public class N_and_M2_Main {
	private static boolean visit[];
	private static int n;
	private static int m;
	private static int a[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n];
		a = new int[m];
		
		solve(0);
	}
	
	private static void solve(int count) {
		if(count==m) {
			for(int i=0;i<m;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(visit[i]==false) {
				visit[i]=true;
				a[count]=i+1;
				solve(count+1);
				//visit[i]=false;
			}
		}
	}
}
