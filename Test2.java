package pkg2;
import pkg1.Test1;

public class Test2 {
	static String CONST_2 = "CONST2";
	private static int classNumber;
		
	
	public void localVarInMethod() {
		int i = 0;
		
		while (i <= 10) {
			//int i  = 1;
			System.out.println("i value " + i);
			i++;
		}
	}
	/***/
	public static void main (String [] args) {
		Test2 test2 = new Test2();
		Test1 test1 = new Test1(1);
		System.out.println("Instance field value of Test2: " + classNumber);
		System.out.println("Static field value of Test2 CONST_2: " + Test2.CONST_2);
		System.out.println("Static field value of Test1 CONST_1: " + Test1.CONST_1);
		System.out.println("Instance field value of Test1: " + test1.getClassNumber());
		
		test2.localVarInMethod();
	}
}
