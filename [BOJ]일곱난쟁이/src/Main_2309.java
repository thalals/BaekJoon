
/* ���� 2309��
 * ����Ʈ ���� �˰���
 * 
 * �պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.
 * ���ִ� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
 * ��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * <�Է�>
 * ��ȩ ���� �ٿ� ���� �����̵��� Ű�� �־�����. 
 * �־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, 
 * ������ ������ ���� ������ ��쿡�� �ƹ��ų� ����Ѵ�.
 * 
 * �����Լ��� �̿��Ϸ� ������... �� ������ ���°ɷ�,,,��
 */
import java.util.*;

public class Main_2309 {

	public static void main(String[] args) {
		System.out.println("�������� Ű");
		Random rd = new Random(); // ���� ��ü

		int People[] = new int[9];
		
		int sum = 0;

		/*for (int i = 0; i < People.length; i++) {
			People[i] = rd.nextInt(25) + 1;

			for (int j = 0; j < i; j++) // �ߺ�üũ
				if (People[i] == People[j]) {
					i--;
					continue;
				}
		}*/
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++)
			People[i] = sc.nextInt();
		
		for (int i = 0; i < People.length; i++) {
			System.out.println(i + 1 + "�������� Ű : " + People[i]);
			sum = sum + People[i];
		}

		Arrays.sort(People); // �������� ����

		int diff = sum - 100; // diff�� ���� ���ش�.

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < i; j++)
				if (People[i] + People[j] == diff) {
					People[i] = 0;
					People[j] = 0;
				}
			if (People[i] == 0)
				break;
		}
		System.out.println();
		for (int i = 0; i < People.length; i++) {
			if (People[i] != 0)
				System.out.println(i + 1 + "�������� Ű : " + People[i]);
		}
	}
}
