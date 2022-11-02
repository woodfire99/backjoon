package backjoonSilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_9322 {
	
	static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		startTestCase(N);
		System.out.println(sb);
	}
	
	public static void startTestCase(int repeat) throws IOException{
		for(int rep=0; rep<repeat; rep++) {
			// 기본 데이터
			int numbers = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap();
			int[] orders = new int[numbers];
			String[] firstKey = br.readLine().split(" ");
			String[] secondKey = br.readLine().split(" ");
			String[] cryptoText = br.readLine().split(" ");
			String[] resultText = new String[numbers];
			
			// 데이터 삽입
			for(int i=0; i<numbers; i++) {
				map.put(firstKey[i], i);
			}
			
			// 순서 받기
			for(int i=0; i<numbers; i++) {
				orders[i] = map.get(secondKey[i]);
			}
			
			// 순서대로 삽입
			for(int i=0; i<numbers; i++) {
				resultText[orders[i]] = cryptoText[i];
			}
			
			// result 삽입
			for(int i=0; i<numbers; i++) {
				sb.append(resultText[i] + " ");
			}
			sb.append("\n");
		}
	}
}
