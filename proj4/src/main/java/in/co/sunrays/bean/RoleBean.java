package in.co.sunrays.bean;
/**
 * Role JavaBean encapsulates Role attributes
 * @author Tarun
 *
 */
public class RoleBean extends BaseBean {

	public static final int ADMIN = 1;
	public static final int STUDENT = 2;
	public static final int COLLEGE_SCHOOL = 3;
	public static final int KIOSK = 4;
	public static final int FACULTY = 5;
	/**
	 * name of role
	 *
	 */
	private String name;
	/**
	 * description of role
	 *
	 */
	private String description;

	public RoleBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		return id + "";
	}

	public String getValue() {
		return name;
	}

	public int compareTo(BaseBean o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
