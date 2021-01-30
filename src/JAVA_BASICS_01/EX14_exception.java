package JAVA_BASICS_01;

/*
 * 오류가 난다
 * 프로그래밍을 하면 많은 오류 상황에 직면하게 된다. 
 * 기능이 많아질수록 오류가 발생할 확률은 기하급수적으로 증가한다. 
 * 자연스럽게 오류를 잘 처리하기 위한 방법들이 필요해지게 된다. 
 * 예외(Exception)란 프로그램을 만든 프로그래머가 상정한 정상적인 
 * 처리에서 벗어나는 경우에 이를 처리하기 위한 방법이다. 자바는 예기치 못한 
 * 오류를 어떻게 처리하는가를 알아보자.
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
    }
	} 
public class EX14_exception {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();

	}
}
*/
//
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        try {
//            System.out.print("계산결과는 ");
//            System.out.print(this.left/this.right);
//            System.out.print(" 입니다.");
//        } catch(Exception e){
//            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
//            System.out.println("\n\ne.toString()\n"+e.toString());
//            System.out.println("\n\ne.printStackTrace()");
//            e.printStackTrace();
//        }
//    }
//} 
//public class EX14_exception {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}