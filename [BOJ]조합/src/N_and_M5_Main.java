import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* ���� n��m 5�� (15654��)
 * �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * N���� �ڿ����� ��� �ٸ� ���̴�.
 * 
 * -> ù° �ٿ� N�� M�� �־�����. (1 �� M �� N �� 8)
 * -> ��° �ٿ� N���� ���� �־�����. �Է����� �־����� ���� 10,000���� �۰ų� ���� �ڿ����̴�.
 * 
 * ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M �� N �� 8)
 * 
 * �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.
 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
 * 
 */
public class N_and_M5_Main {
	private static boolean visit[];
	private static int n,m;
	private static int a[];
	private static int b[];
	static StringBuilder sb = new StringBuilder();		//�ð��ʰ� �ذ�
	
	//Main
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n];
		a = new int[n];
		b = new int[n];
		
		String str1[] = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
			b[i] = Integer.parseInt(str1[i]);
		Arrays.sort(b);
		
		solve(0);
		System.out.println(sb);
	}
	
	//Solve
	public static void solve(int count) {
		//�������� - ���
		if(count==m) {
			for(int i=0;i<m;i++)
				sb.append(a[i]+" ");
			sb.append("\n");	
			
			return;
		}
		
		//index�� ������ �����Ƿ� �ݺ����� ������ a[]�� ���� ���� �����Ͽ� ����
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				a[count]=b[i];
				solve(count+1);	
				visit[i] = false;
			}
		}
	}
}