package pro_lev0;

public class Q12_피자나누기1 {

	public static void main(String[] args) {
		// 피자 나눠먹기(1)
		// 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
		// 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
		
		// 입출력 예
		// n	result
		// 7	1
		// 1	1
		// 15	3
		
		int n=15;
		int answer=0;
		
		if(n%7==0) {
			answer=n/7;
		}else if(n%7!=0) {
			answer=n/7+1;
		}
			
			
			
		System.out.println(answer);
	}

}
