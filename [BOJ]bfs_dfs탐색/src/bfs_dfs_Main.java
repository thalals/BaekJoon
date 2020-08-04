import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.*;

/* ���� 1260�� bfs_dfs Ž��
 * 
 * �׷����� DFS�� Ž���� ����� BFS�� Ž���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, �湮�� �� �ִ� ������ ���� ���� ��쿡�� ���� ��ȣ�� ���� ���� ���� �湮�ϰ�, 
 * �� �̻� �湮�� �� �ִ� ���� ���� ��� �����Ѵ�. ���� ��ȣ�� 1������ N�������̴�.
 * 
 * ù° �ٿ� ������ ���� N(1 �� N �� 1,000), ������ ���� M(1 �� M �� 10,000), Ž���� ������ ������ ��ȣ V�� �־�����.
 * ���� M���� �ٿ��� ������ �����ϴ� �� ������ ��ȣ�� �־�����. � �� ���� ���̿� ���� ���� ������ ���� �� �ִ�. �Է����� �־����� ������ ������̴�.
 * 
 * ù° �ٿ� DFS�� ������ �����, �� ���� �ٿ��� BFS�� ������ ����� ����Ѵ�. V���� �湮�� ���� ������� ����ϸ� �ȴ�.
 */
public class bfs_dfs_Main {
	private static int n,m,v;
	private static int map[][];		//������ ����
	private static boolean check[];	//�湮üũ
	private static ArrayList<Integer>[] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[] = br.readLine().split(" ");
		// n,m,v
		n = Integer.parseInt(input[0]);		//������ ����
		m = Integer.parseInt(input[1]);		//������ ����
		v = Integer.parseInt(input[2]);		//���� ��ġ
		
		//list[i] = new ArrayList<Integer>();
		
		map = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i =0;i<n+1;i++)
			Arrays.fill(map[i],0);		//�迭 ��ü �ʱ�ȭ
		
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
	//���̿켱Ž��
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
	//�ʺ�켱Ž��
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();	//ťũ��� ����
		
		q.offer(start);		//ť�� ����
		check[start]=true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();	//�湮��ġ ��
			
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
