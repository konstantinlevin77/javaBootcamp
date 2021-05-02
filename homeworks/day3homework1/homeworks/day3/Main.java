package homeworks.day3;

public class Main {

	public static void main(String[] args) {
		
		Course javaCourse = new Course("Java Kampı","Engin Demiroğ","imgs/course.png","imgs/instructor.png",
				0,5,1
				);
		
		Course[] createdCourses = {javaCourse};
		
		Instructor enginDemirog = new Instructor(1,"Engin","Demiroğ","engindemirog@mail.com","sifre123",createdCourses);
		
		System.out.println(enginDemirog.getFirstName());
		System.out.println(enginDemirog.getLastName());
		System.out.println(enginDemirog.getEmail());
		System.out.println(enginDemirog.getPassword());
		System.out.println(enginDemirog.getId());
		
		for (Course createdCourse : enginDemirog.getCreatedCourses()) {
			System.out.println(createdCourse.getCourseName());
		}
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(enginDemirog);
		instructorManager.remove(enginDemirog);
		
		Course csharpCourse = new Course("C# Kampı","Engin Demiroğ","imgs/course2.png","imgs/instructor.png",0,5,2);
		
		instructorManager.createCourse(enginDemirog, csharpCourse);
		instructorManager.deleteCourse(enginDemirog, csharpCourse);
		
		Course[] enrolledCourses = {javaCourse};
		
		Student student1 = new Student(1,"Mehmet","Kimbuki","mehmetkimbuki@mail.com","sifre321",enrolledCourses);
		
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getEmail());
		System.out.println(student1.getPassword());
		System.out.println(student1.getId());
		
		for (Course enrolledCourse : student1.getEnrolledCourses()) {
			System.out.println(enrolledCourse.getCourseName());
		}
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.remove(student1);
		studentManager.enrollCourse(student1, csharpCourse);
		studentManager.leaveCourse(student1, csharpCourse);
		studentManager.giveScoreToCourse(student1, csharpCourse, 5);
		
		
	}

}
