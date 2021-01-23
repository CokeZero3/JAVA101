package JAVA_BASICS_01;

public class Ex03_string {
	public static void main(String[] args) {
		  // Character VS String 
        System.out.println("Hello World"); // String
        System.out.println('H'); // Character
        System.out.println("H"); 
     
        System.out.println("Hello "
                + "World");
         
        // new line
        System.out.println("Hello \nWorld");
         
        // escape
        System.out.println("Hello \"World\"");// Hello "World"
        // length 길이 확인
        System.out.println("Hello \"World\"".length());// 13
        // replace
        System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru"));

	}
}
