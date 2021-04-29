public class CourseManager {
	
	public void enrollCourse(Course course) {
		System.out.println("Başarıyla kaydoldun: "+course.courseName);
	}
	
	public void leaveCourse(Course course) {
		System.out.println("Kursu bıraktın: "+course.courseName);
		
	}
	
	public void goToCourse(Course course) {
		System.out.println("Kurs Sayfası: "+course.courseName);
	}
	
}
