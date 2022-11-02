package backjoonSilver;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11866 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList();
		
		// 값 삽입
		for(int i=1; i<=N; i++) {
			arr.add(i);
		}
		
		// 값 설정
		int index = 0;
		sb.append("<");
		while(arr.size() > 1) {
			index = (index  - 1 + K) % arr.size();
			sb.append(arr.get(index) + ", ");
			arr.remove(index);
		}
		sb.append(arr.get(0) + ">");
		
		System.out.println(sb.toString());
	}
}
