import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/* 백준 2667번 (단지 번호 붙이기)
 * <그림 1>과 같이 정사각형 모양의 지도가 있다. 
 * 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 연결된 집들의 모임인 단지를 정의하고, 
 * 단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 
 * 대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 
 * 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
 * 
 * 첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
 * 
 * 첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
 */

public class 단지번호붙이기_Main {
	private static int dx[] = { -1, 0, 1, 0 };
	private static int dy[] = { 0, 1, 0, -1 };
	static boolean visit[][];
	static int house[][];
	static int count = 0; // 총 단지수
	static int result[] ; // 단지내 집수
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

	//DFS 깊이탐색
	static void search(int x, int y) {

		visit[x][y] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			// 벗어나면 패스
			if (nextX < 0 || nextY < 0 || nextX >= size || nextY >= size) {
				continue;
			}
			if (house[nextX][nextY] == 1 && !visit[nextX][nextY]) {
				search(nextX, nextY);
			}
		}
	}

}
