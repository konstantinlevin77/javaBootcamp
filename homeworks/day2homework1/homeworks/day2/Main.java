package homeworks.day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course javaCourse = new Course(
				"Java&React Geliştirici Kursu",
				"Engin Demiroğ",
				"imgs/courseImage.png",
				"imgs/enginDemirog.png",
				0,
				4.7,
				1
				);
		
		Course csharpCourse = new Course(
				"C# Geliştirici Kursu",
				"Engin Demiroğ",
				"imgs/courseImage.png",
				"imgs/enginDemirog.png",
				0,
				4.5,
				2
				);
		
		Course gettingStartedCourse = new Course(
				"Programlamanın Temelleri Kursu",
				"Engin Demiroğ",
				"imgs/courseImage.png",
				"imgs/enginDemirog.png",
				0,
				4.6,
				3
				);

		Course[] courses = {
				javaCourse,
				csharpCourse,
				gettingStartedCourse
		};
		
		for (Course course : courses) {
			System.out.println(course.courseName+": "+course.instructorName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollCourse(javaCourse);
		
		
	}

}
