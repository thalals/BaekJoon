/* BOJ 2845
 * ù° �ٿ� 1m2�� ����� �� L (1 �� L �� 10)�� ��Ƽ�� ���ȴ� ���� ���� P (1 �� P �� 1000)�� �־�����.
 * ��° �ٿ��� �� ��翡 �Ƿ��ִ� �������� ���� �־�����. 10^6���� ���� ���� ���� 5���� �־�����. 
 * 
 * ����� ���ڿ� ���� ���� ���� ���� ���̸� ���
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("m^2�� �����,   ����");
		
		Scanner sc =  new Scanner(System.in);
		Random rd = new Random();	//���� ��ü
		
		int number = sc.nextInt();
		int width = sc.nextInt();
		int a[] = new int [5];
		
		System.out.println("�Ź��� �� �����");
		for(int i=0;i<5;i++) {
			a[i] = rd.nextInt(1000);		//10^3������ ���� ��
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int True_person = number*width;
		
		for(int i=0;i<5;i++) {
			System.out.print(a[i]-True_person+" ");
		}
	}
}

