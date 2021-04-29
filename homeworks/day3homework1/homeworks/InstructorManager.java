package homeworks;

public class InstructorManager extends UserManager{

	public void createCourse(Instructor instructor, Course newCourse) {
		System.out.println(instructor.getFirstName()+" adlı eğitmen "+newCourse.getCourseName()+ " adlı yeni bir kurs oluşturdu!");
	}
	
	public void deleteCourse(Instructor instructor, Course course) {
		System.out.println(instructor.getFirstName()+" adlı eğitmen "+course.getCourseName()+" adlı kursu sildi.");
	}
	
}
