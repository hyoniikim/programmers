package pro_lev0;

import java.util.Arrays;

public class Q16_배열두배 {

	public static void main(String[] args) {
		// 배열 두 배 만들기
		// 정수 배열 numbers가 매개변수로 주어집니다.
		// numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
		
		// 제한사항
		// -10,000 ≤ numbers의 원소 ≤ 10,000
		// 1 ≤ numbers의 길이 ≤ 1,000
		
		// 입출력 예
		// numbers							result
		// [1, 2, 3, 4, 5]				[2, 4, 6, 8, 10]
		// [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
		
		int[] numbers= {1, 2, 3, 4, 5};
		int[] answer=new int[numbers.length];
		
		for(int i=0; i<answer.length; i++) {
			answer[i]= numbers[i]*2;
		}
		System.out.println(Arrays.toString(answer));
	}

}

// [I@14318bb]와 같은 형식의 문자열이 출력될 때, 이는 [타입@주소]의 형식을 갖고 있다. I는 1차원 int배열이라는 의미이고, '@'뒤에 나오는 16진수는 배열의 주소인데 실제 주소가 아닌 내부 주소
// 배열의 값 자체를 출력하기 위해서는 Arrays.toString(배열이름) 메소드 사용
