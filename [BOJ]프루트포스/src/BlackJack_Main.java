import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* ���� 2798�� ���Ʈ ����
 * ī���뿡�� ���� �α� �ִ� ���� ������ ��Ģ�� ����� ����. ī���� ���� 21�� ���� �ʴ� �ѵ� ������, ī���� ���� �ִ��� ũ�� ����� �����̴�.
 * �ѱ� �ְ��� ���� ��� �������� ���ο� ���� ��Ģ�� ����� ���, â���̿� �����Ϸ��� �Ѵ�.
 * ������ ������ ���迡�� �� ī�忡�� ���� ������ ���� �ִ�. 
 * �� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� �ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��.
 * ���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�.
 *  ���� ���� �����̱� ������, �÷��̾ �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.
 *  
 *  N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
 * 
 * <�Է�>
 * ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. 
 * ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ´�.
 * ���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.
 * 
 * <���>
 * M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�
 */
public class BlackJack_Main {

	public static void main(String[] args) throws IOException {
		System.out.println("N(ī���� ����) ��  M(����)�� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int n, m;
		while (true) {
			System.out.print("N, M : ");
			n = sc.nextInt();
			m = sc.nextInt();
			
			if (n<3 || n > 100)
				System.out.println("n�� 3���� ũ�� 100���� �۾ƾ� �մϴ�");
			else if(m<10||m>300000)
				System.out.println("m�� 10���� ũ�� 30�� ���� �۾ƾ��մϴ�");
				break;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int card[] = new int[n];
		
		String input[] = br.readLine().split(" ");
		
		for(int i=0;i<card.length;i++) {
			card[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(card);
		for(int i=0;i<card.length;i++) {
			System.out.print(card[i]+" ");
		}
		System.out.println();
		
		int max = 0;
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(max<card[i]+card[j]+card[k] && card[i]+card[j]+card[k]<=m ) {
						max = card[i]+card[j]+card[k];
					}
				}
			}
		}
		System.out.println(max);
	}
}
