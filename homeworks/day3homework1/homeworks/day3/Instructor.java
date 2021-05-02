package homeworks.day3;

public class Instructor extends User{
	
	private Course[] createdCourses;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, Course[] createdCourses) {
		// Başka türlü User constructor'unu çalıştıramayacağım ve çalıştırmazsam da
		// private erişim belirleyici kullanamayacağım için super() kullanmak zorunda kaldım.
		super(id,firstName,lastName,email,password);
		this.createdCourses = createdCourses;
	}
	
	public Course[] getCreatedCourses() {
		return createdCourses;
	}
	
	public void setCreatedCourses(Course[] createdCourses) {
		this.createdCourses = createdCourses;
	}
	
	
	
}
