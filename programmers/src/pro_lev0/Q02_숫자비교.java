package pro_lev0;

public class Q02_숫자비교 {

	public static void main(String[] args) {
		// 숫자 비교하기
		//정수 num1과 num2가 매개변수로 주어집니다.
		//두 수가 같으면 1 다르면 -1을 return하도록 solution 함수를 완성해주세요.
		
		//입출력 예
		//num1	num2	result
		// 2	 3		 -1
		// 11	 11		  1
		// 7	 99		 -1

		int num1=7;
		int num2=99;
		int answer=0;
		
		if(num1==num2) {
			answer=1;
		}else if(num1!=num2) {
			answer=-1;
		}
		System.out.println(answer);
	}
}
