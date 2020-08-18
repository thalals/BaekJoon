import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/* 백준 4949번
 * 
 *세계는 균형이 잘 잡혀있어야 한다. 양과 음, 빛과 어둠 그리고 왼쪽 괄호와 오른쪽 괄호처럼 말이다.

정민이의 임무는 어떤 문자열이 주어졌을 때, 괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 짜는 것이다.

문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.

모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
정민이를 도와 문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자.
 * 
 * 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
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
