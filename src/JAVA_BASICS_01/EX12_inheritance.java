package JAVA_BASICS_01;


	class Calculator {
	    int left, right;
	 
	    public void setOprands(int left, int right) {
	        this.left = left;
	        this.right = right;
	    }
	 
	    public void sum() {
	        System.out.println(this.left + this.right);
	    }
	 
	    public void avg() {
	        System.out.println((this.left + this.right) / 2);
	    }
	}
	 
	class SubstractionableCalculator extends Calculator {
	    public void substract() {
	        System.out.println(this.left - this.right);
	    }
	}
	class MultiplicationableCalculator extends Calculator {
	    public void multiplication() {
	        System.out.println(this.left * this.right);
	    }
	}
	class DivisionableCalculator extends MultiplicationableCalculator {
	    public void division() {
	        System.out.println(this.left / this.right);
	    }
	}
public class EX12_inheritance {
	public static void main(String[] args) {

//		SubstractionableCalculator c1 = new SubstractionableCalculator();
//		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
//	      c1.substract();
//        c1.multiplication();
        c1.division();
        

	}

}
