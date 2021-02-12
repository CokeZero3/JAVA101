package JAVA_BASICS_03;

import java.util.Arrays;
import java.util.Scanner;

public class EX03_divisor {
	
	//약수
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = sc.nextInt();
		int sqrt = (int) Math.sqrt(num); // Math클래스를 활용한 제곱근 구하기
		int[] arr = new int[10000]; // 약수를 받기 위한 배열
		int cnt = 0; // 배열의 길이를 위한 선언

		for (int i = 1; i <= sqrt; i++) {
			if (num % i == 0) { // 작은수 저장
				arr[cnt++] = i;
				if (num / i != i) { // 작은수(나누는 수)와 큰수(몫)가 같지 않다면
					arr[cnt++] = num / i; // 큰수(몫) 저장
				}
			}
		}
		//Arrays.sort(data,0,size);를 활용해 0을 제외한 출력문을 만들어도 될 것이라 생각된다.

		int[] arr2 = new int[cnt]; // 기존 약수배열에서 널값을 제외한 값만을 위한 배열 선언

		for (int i = 0; i < cnt; i++) { // 배열의 길이만큼 반복
			arr2[i] = arr[i];
		}

		Arrays.sort(arr2); // array클래스를 활용한 정렬

		for (int i = 0; i < cnt; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}