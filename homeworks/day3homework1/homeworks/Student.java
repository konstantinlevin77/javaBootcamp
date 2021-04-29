package homeworks;

public class Student extends User {
	
	private Course[] enrolledCourses;
	
	
	public Student(int id,String firstName,String lastName, String email,String password, Course[] enrolledCourses) {
		// Başka türlü User constructor'unu çalıştıramayacağım ve çalıştırmazsam da
		// private erişim belirleyici kullanamayacağım için super() kullanmak zorunda kaldım.
		super(id,firstName,lastName,email,password);
		this.enrolledCourses = enrolledCourses;
		
	}
	
	public Course[] getEnrolledCourses() {
		return enrolledCourses;
	}
	
	public void setEnrolledCourses(Course[] enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
	

}
