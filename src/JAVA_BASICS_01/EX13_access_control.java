package JAVA_BASICS_01;


public class EX13_access_control {
	public class car{
		int wheel;
		String color;
		String engine;
		
		void driving() {
			
		}
	}
	public class bus extends car{
		//다중 상속은 안됨 *** 예를 들어 = truck extends car, bus{ 이런식은 에러 발생함.
		String chair;
		
	}
	public static void main(String[] args) {
		
	}

	
}
