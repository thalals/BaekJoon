import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.*;

/* 백준 1260번 bfs_dfs 탐색
 * 
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 * 
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
 * 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 * 
 * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
 */
public class bfs_dfs_Main {
	private static int n,m,v;
	private static int map[][];		//간선의 연결
	private static boolean check[];	//방문체크
	private static ArrayList<Integer>[] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[] = br.readLine().split(" ");
		// n,m,v
		n = Integer.parseInt(input[0]);		//정점의 개수
		m = Integer.parseInt(input[1]);		//간선의 개수
		v = Integer.parseInt(input[2]);		//시작 위치
		
		//list[i] = new ArrayList<Integer>();
		
		map = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i =0;i<n+1;i++)
			Arrays.fill(map[i],0);		//배열 전체 초기화
		
		Arrays.fill(check,false);
		
		for(int i=0;i<m;i++) {
			String edge = br.readLine();
			StringTokenizer str = new StringTokenizer(edge," ");
			
			int a=Integer.parseInt(str.nextToken());
			int b=Integer.parseInt(str.nextToken());
			
			map[a][b]=1;
			map[b][a]=1;
		}
		
		dfs(v);
		
		Arrays.fill(check, false);
		System.out.println();
		bfs(v);
		
	}
	//깊이우선탐색
	public static void dfs(int start) {
		if(check[start])
			return;
		
		check[start] = true;
		System.out.print(start+ " ");
		
		for(int i=1;i<n+1;i++) {
			if(map[start][i]==1)
				dfs(i);
		}
		
	}
	//너비우선탐색
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();	//큐크기는 동적
		
		q.offer(start);		//큐에 삽입
		check[start]=true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();	//방문위치 뺌
			
			System.out.print(temp+" ");
			
			for(int i=1;i<=n;i++) {
				if(map[temp][i]==1&& check[i]==false) {
					q.offer(i);
					check[i]=true;
				}
			}
		}
	}
}
