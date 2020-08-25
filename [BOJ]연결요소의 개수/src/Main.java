import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 11724번
 * 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 
 * 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
 * 
 * 첫째 줄에 연결 요소의 개수를 출력한다.
 */
public class Main {
	static boolean check[][];
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp[] = br.readLine().split(" ");

		int point = Integer.parseInt(temp[0]);
		int line = Integer.parseInt(temp[1]);

		check = new boolean[point+1][point+1];

		for (int i = 0; i < line; i++) {
			String str1[] = br.readLine().split(" ");
			check[Integer.parseInt(str1[0])][Integer.parseInt(str1[1])] = true;
			check[Integer.parseInt(str1[1])][Integer.parseInt(str1[0])] = true;
		}
		dfs(0,0);
	}
	
	static void dfs(int x,int y) {
		if()
	}

}
