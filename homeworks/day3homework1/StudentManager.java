package homeworks;

public class StudentManager extends UserManager {
	
	public void enrollCourse(Student student, Course course) {
		System.out.println(student.getFirstName()+" adlı öğrenci "+course.getCourseName()+" adlı kursa kaydoldu");
	}
	
	public void leaveCourse(Student student, Course course) {
		System.out.println(student.getFirstName()+" adlı öğrenci "+course.getCourseName()+" adlı kursu bıraktı.");
	}
	
	public void giveScoreToCourse(Student student, Course course, double score) {
		System.out.println(student.getFirstName()+" adlı öğrenci "+course.getCourseName()+" adlı kursa "+score+ "puan verdi");
	}
	


}
