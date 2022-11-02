package backjoonSilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Q7785 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		Set<String> set = new HashSet();
		StringBuilder sb = new StringBuilder();
		
		
		int L = Integer.parseInt(br.readLine());
		for(int i=0; i<L; i++) {
			String[] arr = br.readLine().split(" ");
			boolean isEnter = arr[1].equals("enter");
			if(isEnter) {
				set.add(arr[0]);
			}
			else {
				set.remove(arr[0]);
			}
		}
		String[] results = set.toArray(new String[0]);
		Arrays.sort(results, Comparator.reverseOrder());
		
		for(String result : results) {
			sb.append(result+"\n");
		}
		System.out.println(sb.toString());
	}
}
