package homeworks.day3;
public class Course {
	private String courseName;
	private String instructorName;
	private String courseImagePath;
	private String instructorImagePath;
	private int price;
	private int id;
	private double overallRating;
	
	public Course(String courseName, String instructorName, String courseImagePath, String instructorImagePath, int price, double overallRating,int id) {
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.courseImagePath = courseImagePath;
		this.instructorImagePath = instructorImagePath;
		this.price = price;
		this.overallRating = overallRating;
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getCourseImagePath() {
		return courseImagePath;
	}

	public void setCourseImagePath(String courseImagePath) {
		this.courseImagePath = courseImagePath;
	}

	public String getInstructorImagePath() {
		return instructorImagePath;
	}

	public void setInstructorImagePath(String instructorImagePath) {
		this.instructorImagePath = instructorImagePath;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(double overallRating) {
		this.overallRating = overallRating;
	}
	
	
}