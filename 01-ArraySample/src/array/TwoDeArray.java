package array;

import java.util.Scanner;

/**
 * 간단한 입력을 받아 동적 2차원 배열을 테스트하는 클래스
 * @author HannaC
 *
 */
public class TwoDeArray {

	public static void main(String[] args) {
		
		int[][] numbers = new int[4][];
		
		// 자바에서 간단한 입력을 받을 수 있도록 제공하는 Scanner 클래스
		Scanner scan = new Scanner(System.in);
		
		int value = 0;
		for (int i = 0; i < numbers.length; i++) {
			// 동적으로 생성할 2차원 배열의 크기를 입력받는다.
			System.out.println("배열의 크기를 숫자로 입력하세요 : ");
			int input = scan.nextInt();
			// 입력받은 값으로 2차원 배열을 생성(new int[]) 한다.
			numbers[i] = new int[input];
			
			for (int j = 0; j < numbers[i].length; j++) {				
				numbers[i][j] = ++value; 
			}
		}
		
		// 배열의 출력
		for (int[] inner : numbers) {
			for (int n : inner) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}

	}

}
