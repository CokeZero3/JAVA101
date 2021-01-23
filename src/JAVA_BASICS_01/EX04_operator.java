package JAVA_BASICS_01;

public class EX04_operator {

	public static void main(String[] args) {
		
		//Arithmetic 예시
		System.out.println("===========Arithmetic 예시===========");
		 // result 의 값은 3
        int result = 1 + 2;
        System.out.println(result);
  
        // result 의 값은 2
        result = result - 1;
        System.out.println(result);
  
        // result 의 값은 4
        result = result * 2;
        System.out.println(result);
  
        // result 의 값은 2
        result = result / 2;
        System.out.println(result);
  
        // result 의 값은 10
        result = result + 8;
        // result 의 값은 3
        result = result % 7;
        System.out.println(result);
        
		//Remainer 예시
		System.out.println("===========Remainer 예시===========");
        int a = 3;
        System.out.println(0%a);
        System.out.println(1%a);
        System.out.println(2%a);
        System.out.println(3%a);
        System.out.println(4%a);
        System.out.println(5%a);
        System.out.println(6%a);
        
		//Concat 예시
		System.out.println("===========Concat 예시===========");
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
        
        //Division 예시
  		System.out.println("===========Division 예시===========");
        
        int q = 10;
        int w = 3;
          
        float e = 10.0F;
        float r = 3.0F;
          
        System.out.println(q/w);
        System.out.println(e/r);
        System.out.println(q/r);
        
        // 단항 연산자
  		System.out.println("===========PrePost 예시===========");
        int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
	}

}
