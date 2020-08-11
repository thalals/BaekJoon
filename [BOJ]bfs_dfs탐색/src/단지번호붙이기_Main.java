import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/* ���� 2667�� (���� ��ȣ ���̱�)
 * <�׸� 1>�� ���� ���簢�� ����� ������ �ִ�. 
 * 1�� ���� �ִ� ����, 0�� ���� ���� ���� ��Ÿ����. ö���� �� ������ ������ ����� ������ ������ ������ �����ϰ�, 
 * ������ ��ȣ�� ���̷� �Ѵ�. ���⼭ ����Ǿ��ٴ� ���� � ���� �¿�, Ȥ�� �Ʒ����� �ٸ� ���� �ִ� ��츦 ���Ѵ�. 
 * �밢���� ���� �ִ� ���� ����� ���� �ƴϴ�. <�׸� 2>�� <�׸� 1>�� �������� ��ȣ�� ���� ���̴�. 
 * ������ �Է��Ͽ� �������� ����ϰ�, �� ������ ���ϴ� ���� ���� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù ��° �ٿ��� ������ ũ�� N(���簢���̹Ƿ� ���ο� ������ ũ��� ������ 5��N��25)�� �Էµǰ�, �� ���� N�ٿ��� ���� N���� �ڷ�(0Ȥ�� 1)�� �Էµȴ�.
 * 
 * ù ��° �ٿ��� �� �������� ����Ͻÿ�. �׸��� �� ������ ���� ���� ������������ �����Ͽ� �� �ٿ� �ϳ��� ����Ͻÿ�.
 */

public class ������ȣ���̱�_Main {
	private static int dx[] = { -1, 0, 1, 0 };
	private static int dy[] = { 0, 1, 0, -1 };
	static boolean visit[][];
	static int house[][];
	static int count = 0; // �� ������
	static int result[] ; // ������ ����
	static int size;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());

		visit = new boolean[size][size];
		house = new int[size][size];
		for (int i = 0; i < size; i++) {
			String str[] = br.readLine().split("");
			for (int j = 0; j < size; j++)
				house[i][j] = Integer.parseInt(str[j]);
		}
		int index = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (house[i][j] == 1 && visit[i][j] == false) {
					search(i, j);
				
					result[index] = count;
					count=0;
					index++;
				}
			}
		}

		System.out.println(index);
		Arrays.sort(result);
		for (int i = 0; i < index; i++)
			System.out.println(result[i]);
	}

	//DFS ����Ž��
	static void search(int x, int y) {

		visit[x][y] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			// ����� �н�
			if (nextX < 0 || nextY < 0 || nextX >= size || nextY >= size) {
				continue;
			}
			if (house[nextX][nextY] == 1 && !visit[nextX][nextY]) {
				search(nextX, nextY);
			}
		}
	}

}
