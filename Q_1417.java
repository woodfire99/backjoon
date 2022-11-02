package backjoonSilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q_1417 {

	public static void main(String[] args) throws IOException{
		// 기본 데이터
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		PriorityQueue<Integer> heap =  new PriorityQueue(Collections.reverseOrder());
		
		// 데이터 삽입
		int N = Integer.parseInt(br.readLine());
		int target = Integer.parseInt(br.readLine());
		for(int i=1; i<N; i++) {
			heap.add(Integer.parseInt(br.readLine()));
		}
		
		// 계산
		int result = 0;
		while(heap.size() != 0 && heap.peek() >= target) {
			heap.add(heap.poll() - 1);
			target++;
			result++;
		}
		
		System.out.println(result);
	}
}
