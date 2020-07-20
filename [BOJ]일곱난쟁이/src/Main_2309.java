
/* 백준 2309번
 * 프루트 포스 알고리즘
 * 
 * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 * 공주는 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 * <입력>
 * 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 
 * 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 
 * 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 * 
 * 랜덤함수를 이용하려 했으나... 더 연구해 보는걸로,,,ㅠ
 */
import java.util.*;

public class Main_2309 {

	public static void main(String[] args) {
		System.out.println("난쟁이의 키");
		Random rd = new Random(); // 랜덤 객체

		int People[] = new int[9];
		
		int sum = 0;

		/*for (int i = 0; i < People.length; i++) {
			People[i] = rd.nextInt(25) + 1;

			for (int j = 0; j < i; j++) // 중복체크
				if (People[i] == People[j]) {
					i--;
					continue;
				}
		}*/
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++)
			People[i] = sc.nextInt();
		
		for (int i = 0; i < People.length; i++) {
			System.out.println(i + 1 + "난쟁이의 키 : " + People[i]);
			sum = sum + People[i];
		}

		Arrays.sort(People); // 오름차순 정렬

		int diff = sum - 100; // diff의 값을 빼준다.

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
				System.out.println(i + 1 + "난쟁이의 키 : " + People[i]);
		}
	}
}
