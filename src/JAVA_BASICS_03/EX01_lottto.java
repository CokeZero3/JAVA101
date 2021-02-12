package JAVA_BASICS_03;

public class EX01_lottto {
	public static void main(String[] args) {
		int lotto[ ] = new int[6];
		boolean a;
		
		for(int i=0;i<lotto.length;i++) { //lotto 변수의 길이만큼 반복
			int num = (int)(Math.random() * 45+1); //변수생성
			a = true;
			
			for(int j = 0;j<lotto.length;j++) {
				if(lotto[j] == num) { //중복검사
					i--; // 중복일때 i 감소
					a = false;
					System.out.println(num+"중복"); //동작확인을 위한 프린트
					break;
				}
			}
		if(a) {
			lotto[i] = num;
			System.out.println(lotto[i] + " ");
		}
				
		}
}
}
