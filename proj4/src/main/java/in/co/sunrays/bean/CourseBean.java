package in.co.sunrays.bean;

/**
 * Course JavaBean encapsulates Course attributes
 * 
 * @author Tarun
 *
 */
public class CourseBean extends BaseBean {
	 /**
     * name of course
     */
	private String Course_Name;
	 /**
     * description of course
     */
	private String Description;
	 /**
     * duration of course
     */
	private String Duration;

	public String getCourse_Name() {
		return Course_Name;
	}

	public void setCourse_Name(String course_Name) {
		this.Course_Name = course_Name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		this.Duration = duration;
	}

	public String getKey() {

		return id + "";
	}

	public String getValue() {

		return Course_Name;
	}

	public int compareTo(BaseBean o) {

		return 0;
	}

}
