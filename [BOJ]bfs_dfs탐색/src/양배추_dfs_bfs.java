import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* ���� 1012��
 * 
 * ������ ������ �ѳ��� ������ �������� ����� ���߸� ����ϱ�� �Ͽ���.
 * ����� ���� �ʰ� ���߸� ����Ϸ��� ���߸� �������κ��� ��ȣ�ϴ� ���� �߿��ϱ� ������,
 * �ѳ��� ���� ������ ȿ������ �����������̸� �����ϱ�� ����Ѵ�. �� �����̴� ���߱�ó�� �����ϸ� ������ ��� �������ν� ���߸� ��ȣ�Ѵ�.
 * Ư��, � ���߿� �����������̰� �� ������ ��� ������ �� �����̴� ������ �ٸ� ���߷� �̵��� �� �־�, �� ���ߵ� ���� �������κ��� ��ȣ���� �� �ִ�.
 * (�� ������ �����¿� �� ���⿡ �ٸ� ���߰� ��ġ�� ��쿡 ���� �������ִٰ� �����Ѵ�)
 * �ѳ��� ���߸� ����ϴ� ���� ���� ���ؼ� ���߸� �������� �ɾ���Ҵ�.
 * ���ߵ��� ���ִ� ������ �����������̰� �� ������ ������ �ǹǷ� ���� �������ִ� ���ߵ��� �� ������ �����ִ��� �����ϸ� �� �� ������ �����̰� �ʿ����� �� �� �ִ�.
 * ���� ��� ���߹��� �Ʒ��� ���� �����Ǿ� ������ �ּ� 5������ �����������̰� �ʿ��ϴ�.
 * (0�� ���߰� �ɾ��� ���� ���� ���̰�, 1�� ���߰� �ɾ��� �ִ� ���� ��Ÿ����.)
 * 
 * �Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * �� ���� �ٺ��� ������ �׽�Ʈ ���̽��� ���� ù° �ٿ��� ���߸� ���� ���߹��� ���α��� M(1 �� M �� 50)�� ���α��� N(1 �� N �� 50),
 * �׸��� ���߰� �ɾ��� �ִ� ��ġ�� ���� K(1 �� K �� 2500)�� �־�����. �� ���� K�ٿ��� ������ ��ġ X(0 �� X �� M-1), Y(0 �� Y �� N-1)�� �־�����.
 * 
 * �� �׽�Ʈ ���̽��� ���� �ʿ��� �ּ��� ������������ ���� ���� ����Ѵ�.
 */
public class �����_dfs_bfs {
	private static int count = 0;
	private static int m; // ����
	private static int n; // ����
	private static int k; // ������ ��ġ
	private static int map[][];
	private static boolean visit[][];
	static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� t

		while (t != 0) {
			String arr[] = br.readLine().split(" ");
			m = Integer.parseInt(arr[0]);
			n = Integer.parseInt(arr[1]);
			k = Integer.parseInt(arr[2]);

			map = new int[n][m]; // ��
			visit = new boolean[n][m];

			for (int i = 0; i < n; i++) {
				Arrays.fill(map[i], 0);
				Arrays.fill(visit[i], false);
			}

			// ������ ��ġ
			for (int i = 0; i < k; i++) {
				String jirung_map = br.readLine();
				StringTokenizer str = new StringTokenizer(jirung_map, " ");
				int a = Integer.parseInt(str.nextToken());
				int b = Integer.parseInt(str.nextToken());
				map[b][a] = 1;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == 1 && visit[i][j]!= true  ) {
						dfs(i, j);	//���߼�Ȯ(�αٹ��� ����) ->�����¿� ���� �湮
						count++;
					}
				}
			}
			System.out.println(count);
			count=0;
			t--;
		}
	}

	// ����Ž��
	private static void dfs(int x, int y) {
		if (visit[x][y]==true)
			return;

		visit[x][y] = true;
		
		for(int i=0;i<4;i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			
			//���� ����� �н�
			if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                continue;
            }
			
			if(map[nextX][nextY]==1)
				dfs(nextX,nextY);
		}
		
	}

}
