import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 백준 n과m 1번 (15649번)
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * 
 */
public class N_and_M1_Main {
	private static boolean visit[][];
	private static int map[][];
	private static int n;
	private static int m;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n+1][n+1];
		map = new int[n+1][n+1];
		
		
		
		for(int i=1;i<=n;i++) {
			for(int k=0;k<n+1;k++) {
				Arrays.fill(visit[k], false);
			
				dfs(i,k);
			}
		}
	}
	
	private static void dfs(int x,int y) {
		
		for(int i=0;i<=n;i++) {
			visit[x][i] = true;
		}
		
		
		if(visit[x+1][y+1]!=true && x<n && y<n) {
			dfs(x+1,y+1);
			System.out.print(y+" ");
		}
		
		
	}
}
