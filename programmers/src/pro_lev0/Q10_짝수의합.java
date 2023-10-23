package pro_lev0;

public class Q10_짝수의합 {

	public static void main(String[] args) {
		// 짝수의 합
		// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
		
		//입출력 예
		// n		result
		// 10		  30
		// 4	  	  6

		int n=4;
		int answer=0;
		
		for(int i=2; i<=n; i=i+2) {
			answer=answer+i;
		}
		
		System.out.println(answer);
	}

}
