import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���� 11724��
 * ���� ���� �׷����� �־����� ��, ���� ��� (Connected Component)�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� ������ ���� N�� ������ ���� M�� �־�����. (1 �� N �� 1,000, 0 �� M �� N��(N-1)/2) 
 * ��° �ٺ��� M���� �ٿ� ������ �� ���� u�� v�� �־�����. (1 �� u, v �� N, u �� v) ���� ������ �� ���� �־�����.
 * 
 * ù° �ٿ� ���� ����� ������ ����Ѵ�.
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
