package pro_lev0;

public class Q06_나누기 {

	public static void main(String[] args) {
		// 두수의 나눗셈
		// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.

		//입출력 예
		//num1	num2	result
		//3		2		1500
		//7		3		2333
		//1		16		62
		
		int num1=1;
		int num2=16;
		int answer=num1*1000/num2;
	
		System.out.println(answer);
	}

}
