package lab8;

public class CollegeCourse {
	
	private int courseNumber;
	private int courseReferenceNumber;
	
	//Constructor
	public CollegeCourse() {	}
	public CollegeCourse(int courseNumber, int courseReferenceNumber) {
		this.courseNumber = courseNumber;
		this.courseReferenceNumber = courseReferenceNumber;
	}
	
	//Getter and setter
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCourseReferenceNumber() {
		return courseReferenceNumber;
	}
	public void setCourseReferenceNumber(int courseReferenceNumber) {
		this.courseReferenceNumber = courseReferenceNumber;
	}

	@Override
	public String toString() {
//		return super.toString();
		return "Course Number: " + courseNumber + ", Course Reference Number: " + courseReferenceNumber;
	}
	
}
