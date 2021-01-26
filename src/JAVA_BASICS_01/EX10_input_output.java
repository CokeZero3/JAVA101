package JAVA_BASICS_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX10_input_output {

	public static void main(String[] args) {
		/*
		 아시다시피 main 메소드는 자바에서 특별한 의미를 가진 메소드다.
		 main 메소드의 내용을 구현하면 자바 에플리케이션을 실행할 때 main 메소드가 호출되면서 프로그램이 구동하게 되는 것이다. 
		 이 때 Strings[] args는 입력 값의 파라미터로 동작한다.
		 	*/
//		   System.out.println(args.length);
		
		
//		for(String e : args){
//            System.out.println(e);
//        }
		/*
		 위의 예제는 for-each 구문을 이용해서 변수 args에 담긴 값을 한줄씩 출력하고 있다.
		 즉 자바 에플리케이션에서는 메소드 main의 인자 String[] args를 통해서 사용자가 입력한 값을 전달하고 있다는 것을 알 수 있다.
		 */
		
		//scanner 예시1
/*		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
        위의 예제를 실행하고 숫자를 입력하면 입력한 숫자의 1000배가 출력 될 것이다. 
        예제에서 우리가 주목해야 할 부분은 sc.nextInt()가 실행되면 자바는 사용자의 입력이 있을 때까지 
        변수 i에 값을 할당하지 않고 대기상태에 있게 된다. 키보드로 데이터를 입력하고 엔터를 누르면 비로서 i에 값이 담기고 
        i*1000을 통해서 입력값에 1000이 곱해지고 그 결과가 화면에 출력된다. 
*/       
		//scanner 예시2
/*		
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
*/
		 try {
	            File file = new File("out.txt");
	            Scanner sc = new Scanner(file);
	            while(sc.hasNextInt()) {
	                System.out.println(sc.nextInt()*1000); 
	            }
	            sc.close();
	        } catch(FileNotFoundException e){
	            e.printStackTrace();
	        }
	}

}
