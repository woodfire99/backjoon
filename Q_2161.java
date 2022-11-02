package backjoonSilver;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Q_2161 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		// 데이터 삽입
		int N = scanner.nextInt();
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=1; i<=N; i++) {
			deque.add(i);
		}
		
		// 시작
		while(deque.size() > 1) {
			sb.append(deque.pollFirst() + " ");
			deque.add(deque.pollFirst());
		}
		sb.append(deque.pop());
		System.out.print(sb);
	}
}
