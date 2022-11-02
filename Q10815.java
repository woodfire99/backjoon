package backjoonSilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10815 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		boolean[] arr = new boolean[20000001];
		StringBuilder sb = new StringBuilder();
		
		// N
		int N = Integer.parseInt(br.readLine());
		String[] NArr = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			int N_num = Integer.parseInt(NArr[i]);
			arr[N_num + 10000000] = true;
		}
		
		// M
		int M = Integer.parseInt(br.readLine());
		String[] MArr = br.readLine().split(" ");
		for(int i=0; i<M; i++) {
			int M_num = Integer.parseInt(MArr[i]);
			if(arr[M_num + 10000000])sb.append("1 ");
			else sb.append("0 ");
		}
		
		// result
		System.out.println(sb.toString());
	}
	
}

