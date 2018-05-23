package array;

/**
 * Enhanced for statement 의 용법을 테스트하는 클래스
 * @author HannaC  
 */
public class ForTest {

	public static void main(String[] args) {
		// 3 x 4 사이즈의 2차원 배열의 선언
		int[][] numbers = new int[3][4];
		
		// 값 할당
		int value = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = ++value; 
			}
		}
		
		// 값 출력 : enhanced for statement 를 사용
		for (int[] inner : numbers) {
			for (int n : inner) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}

	}

}



