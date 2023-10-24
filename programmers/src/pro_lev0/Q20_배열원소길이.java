package pro_lev0;

import java.util.Arrays;

public class Q20_배열원소길이 {

	public static void main(String[] args) {
		// 배열 원소의 길이
		// 문자열 배열 strlist가 매개변수로 주어집니다.
		// strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.

		//제한사항
		// 1 ≤ strlist 원소의 길이 ≤ 100
		// strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
		
		//입출력 예
		// 			strlist						result
		// ["We", "are", "the", "world!"]		[2, 3, 3, 6]
		// ["I", "Love", "Programmers."]		[1, 4, 12]
		
		String[] strlist = {"I", "Love", "Programmers."};
		int[] answer = new int[strlist.length];
		
		for(int i=0; i<strlist.length; i++) 
			answer[i] = strlist[i].length();
		
		System.out.println(Arrays.toString(answer));
	}

}
