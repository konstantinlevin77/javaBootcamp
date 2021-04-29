public class Course {
	String courseName;
	String instructorName;
	String courseImagePath;
	String instructorImagePath;
	int price;
	int id;
	double overallRating;
	
	public Course(String courseName, String instructorName, String courseImagePath, String instructorImagePath, int price, double overallRating,int id) {
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.courseImagePath = courseImagePath;
		this.instructorImagePath = instructorImagePath;
		this.price = price;
		this.overallRating = overallRating;
		this.id = id;
	}
	
	
}