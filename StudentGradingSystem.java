package project;

class InvalidMarksException extends Exception{
	public InvalidMarksException(String msg) {
		super(msg);
	}
}
class Student {
	int StudentID;
	String name;
	int marks;
	
	public void assignMarks(int m, String n, int si) throws InvalidMarksException{
		this.StudentID=si;
		this.name=n;
		this.marks=m;
		if(m<0 || m>100) {
			throw new InvalidMarksException("marks cannot b less than 0 and greater than 100");
		}else {
			System.out.println("marks entered : "+m);
			System.out.println("student id : "+si);
			System.out.println("name is : "+n);
		}
	}
}
public class StudentGradingSystem {

	public static void main(String[] args) {
		Student s=new Student();
		try {
			s.assignMarks(30, "alien", 6548);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
