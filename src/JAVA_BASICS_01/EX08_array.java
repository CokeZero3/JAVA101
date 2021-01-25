package JAVA_BASICS_01;

public class EX08_array {

	public static void main(String[] args) {
		//배열 Array
		/*
		 //배열의 생성 + 저장 및 불러오기
        String[] classGroup = { "cokezero", "cokeone", "coketwo", "cokethree" };
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);
        */
		
		//배열의 생성
		/*
		String[] classGroup = new String[4];
        classGroup[0] = "cokezero";
        System.out.println(classGroup.length);
        classGroup[1] = "cokeone";
        System.out.println(classGroup.length);
        classGroup[2] = "coketwo";
        System.out.println(classGroup.length);
        classGroup[3] = "cokethree";
        System.out.println(classGroup.length);
		*/
		
		// 배열의 사용
		/*
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다");
        }
        */
		//For Each문 예시)
		/*
		 위의 구문은 배열 members의 값을 변수 e에 담아서 중괄호 구간 안으로 전달해준다. 
		 반복문의 종료조건이나 종료조건을 위해서 기준값을 증가시키는 등의 반복적인 
		 작업을 내부적으로 감춘 것이라고 할 수 있다. 자바 5.0부터 도입된 기능이다.
		 * */
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }
		
	}

}
