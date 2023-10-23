package pro_lev0;

public class Q15_세균증식 {

	public static void main(String[] args) {
		// 세균 증식
		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
		// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

		// 제한사항
		// 1 ≤ n ≤ 10
		// 1 ≤ t ≤ 15
		
		// 입출력 예
		// n	t	result
		// 2	10	2048
		// 7	15	229,376

		int n=7;
		int t=15;
		int answer=n;
		
		for(int i=1; i<=t; i++) {
			answer=answer*2;
		}

		System.out.println(answer);
	}

}
