/* BOJ 2845
 * 첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.
 * 둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 10^6보다 작은 양의 정수 5개가 주어진다. 
 * 
 * 출력은 기자에 나온 수와 실제 수의 차이를 출력
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("m^2당 사람수,   넓이");
		
		Scanner sc =  new Scanner(System.in);
		Random rd = new Random();	//랜덤 객체
		
		int number = sc.nextInt();
		int width = sc.nextInt();
		int a[] = new int [5];
		
		System.out.println("신문의 난 사람수");
		for(int i=0;i<5;i++) {
			a[i] = rd.nextInt(1000);		//10^3이하의 랜덤 수
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int True_person = number*width;
		
		for(int i=0;i<5;i++) {
			System.out.print(a[i]-True_person+" ");
		}
	}
}

