import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���� n��m 1�� (15649��)
 * �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
 * 
 * ->���� ���� ���� �� ��� �ȴ�. (�߰�����)
 * 
 * ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M �� N �� 8)
 * 
 * �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.
 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
 * 
 */
public class N_and_M3_Main {
	private static boolean visit[];
	private static int n,m;
	private static int a[];
	static StringBuilder sb = new StringBuilder();		//�ð��ʰ� �ذ�
	
	//Main
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n];
		a = new int[m];
		
		solve(0);
		System.out.println(sb);
	}
	
	//Solve
	public static void solve(int count) {
		//�������� -���
		if(count==m) {
			for(int i=0;i<m;i++)
				sb.append(a[i]+" ");
			sb.append("\n");	
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			a[count]=i+1;
			solve(count+1);
		}
	}
}