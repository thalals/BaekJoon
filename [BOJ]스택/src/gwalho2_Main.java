import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/* ���� 4949��
 * 
 *����� ������ �� �����־�� �Ѵ�. ��� ��, ���� ��� �׸��� ���� ��ȣ�� ������ ��ȣó�� ���̴�.

�������� �ӹ��� � ���ڿ��� �־����� ��, ��ȣ���� ������ �� ������ �ִ��� �Ǵ��ϴ� ���α׷��� ¥�� ���̴�.

���ڿ��� ���ԵǴ� ��ȣ�� �Ұ�ȣ("()") �� ���ȣ("[]")�� 2�����̰�, ���ڿ��� ������ �̷�� ������ �Ʒ��� ����.

��� ���� �Ұ�ȣ("(")�� ������ �Ұ�ȣ(")")�͸� ¦�� �̷�� �Ѵ�.
��� ���� ���ȣ("[")�� ������ ���ȣ("]")�͸� ¦�� �̷�� �Ѵ�.
��� ������ ��ȣ���� �ڽŰ� ¦�� �̷� �� �ִ� ���� ��ȣ�� �����Ѵ�.
��� ��ȣ���� ¦�� 1:1 ��Ī�� �����ϴ�. ��, ��ȣ �ϳ��� �� �̻��� ��ȣ�� ¦�������� �ʴ´�.
¦�� �̷�� �� ��ȣ�� ���� ��, �� ���̿� �ִ� ���ڿ��� ������ ������ �Ѵ�.
�����̸� ���� ���ڿ��� �־����� �� �������� ���ڿ����� �ƴ����� �Ǵ��غ���.
 * 
 * ����� ǥ�� ����� ����Ѵ�. ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
 */
public class gwalho2_Main {
	static int testCase;
	static Stack<String> gwalho;
	
	static String result[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (true) {
			String str[] = br.readLine().split("");
			
			if (str[0].equals(".")) {
				break;
			}
			
			if (vps_check(str))
				System.out.println("yes");
			else
				System.out.println("no");
			
		}

	}

	static boolean vps_check(String str[]) {
		gwalho = new Stack<>();
		
		for (int i = 0; i < str.length; i++) {
			switch (str[i]) {
			case "(":
				gwalho.push(str[i]);
				break;
				
			case ")":
				if (gwalho.isEmpty())
					return false;
				else if(gwalho.peek().equals("(")) {
					gwalho.pop();
					break;
				}
				else
					return false;
				
			case "[":
				gwalho.push(str[i]);
				break;
				
			case "]":
				if (gwalho.isEmpty())
					return false;
				else if(gwalho.peek().equals("[")) {
					gwalho.pop();
					break;
				}
				else
					return false;

			}
		}

		if (gwalho.isEmpty())
			return true;
		else
			return false;
	}

}
