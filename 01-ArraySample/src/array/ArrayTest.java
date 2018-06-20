package array;

import java.util.Arrays;
import java.util.List;

/**
 * int 배열과 String 배열을 생성하고 출력해보는 클래스
 * @author HannaC
 *
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[200];
		
		// 전통적인 방식의 for구문 출력
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
 
		// foreach 구문
		for (int n : numbers) {
			System.out.println(n);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			System.out.println(n);			
		}
		
		// String 배열을 사용하는 경우
		String[] names = new String[10];
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// Java 8버전에서 foreach 라는 자동 순회 메소드가 추가됨
		// Java 8버전의 람다식(Lambda expression) 을 사용하는 foreach 메소드를사용
		// 1. names 배열을 리스트로 변경
		List<String> nameList = Arrays.asList(names);
		// 2. 변경된 리스트에 foreach 메소드 적용하여 출력
		//    변수 값 -> 구문
		// 람다식에서 한개 이상의 구문을 실행할 때는 {}로 묶는다
		nameList.forEach(name -> {
				System.out.println(name);
			});
		// 람다식에서 한개의 구문만 실행할 때는 {}를 생략 가능
		nameList.forEach(name -> System.out.println(name));
		
	}

}





