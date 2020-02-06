import java.util.Date;

public class Student {
	
	private static int count = 0;	// static field
	private String studentId; 		//instance file
	
	static {	// static initializer
		System.out.println("Student class loaded");
	}
	
	{	// instance initializer
		Student.count = Student.count + 1;
		System.out.println("Student count incremented");
	}	
	
	public Student (String id) {	// constructor
		this.studentId = id;
		System.out.println(
			new Date() +
			" Student instance created. Total students created = " + count);
	}
	
	public String toString() {	// instance method		
		return "Student[studentId = " + studentId + "]";
	}
	
	public static void main(String [] args) {	// static method
		Student s = new Student("A1234");
		System.out.println(s.toString());
	}
}


