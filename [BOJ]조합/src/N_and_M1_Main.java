import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* ���� n��m 1�� (15649��)
 * �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
 * 
 * ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M �� N �� 8)
 * 
 * �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.
 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
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
