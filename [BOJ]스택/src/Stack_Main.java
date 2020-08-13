import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ���� 10773�� 
 * 
 * ���ڴ� ���� ����̴� ���Ƹ� ȸ���� �غ��ϱ� ���ؼ� ��θ� �����ϴ� ���̴�.
 * �����̴� ����̸� ���ͼ� ���� �����ϴ� ���ε�, �ּ��ϰԵ� �׻� ���ž��� �����̴� ���� �Ǽ��� �߸� �θ��� ��� ġ�� �Ͼ�����.
 * �����̴� �߸��� ���� �θ� ������ 0�� ���ļ�, ���� �ֱٿ� ����̰� �� ���� ����� ��Ų��.
 * ����̴� �̷��� ��� ���� �޾� ���� �� �� ���� ���� �˰� �;� �Ѵ�. ����̸� ��������!
 * 
 * ù ��° �ٿ� ���� K�� �־�����. (1 �� K �� 100,000)
 * ���� K���� �ٿ� ������ 1���� �־�����. ������ 0���� 1,000,000 ������ ���� ������, 
 * ������ "0" �� ��쿡�� ���� �ֱٿ� �� ���� �����, �ƴ� ��� �ش� ���� ����.
 * ������ "0"�� ��쿡 ���� �� �ִ� ���� ������ ������ �� �ִ�.
 * 
 * ����̰� ���������� ���� �� ���� ���� ����Ѵ�. ���������� ��� ���� ���� 231-1���� �۰ų� ���� �����̴�.
 */

public class Stack_Main {
	static int tmp;
	static ArrayList<Integer> numbers = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		int sum =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testCase;i++) {
			tmp = Integer.parseInt(br.readLine());
			
			if(tmp==0) {
				if(numbers.size()==0)
					continue;
				
				numbers.remove(numbers.size()-1);
			}
			else
				numbers.add(tmp);
				
		}
		
		for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
		System.out.println(sum);
	}

}
