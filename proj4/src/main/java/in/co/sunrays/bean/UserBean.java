package in.co.sunrays.bean;

import java.sql.Timestamp;
import java.util.Date;
/**User javabean encapsulates user attributes
 * @author Tarun
 *
 */

public class UserBean extends BaseBean {

public static final String ACTIVE = "Active";
public static final String INACTIVE = "Inactive";
/**
 * firstname of User
 *
 */
private String firstName;
/**
 * lastname of User
 *
 */
private String lastName;
/**
 * login of User
 *
 */
private String login;
/**
 * password of User
 *
 */
private String password;
/**
 * confirm password of User
 *
 */
private String confirmPassword;
/**
 * date of birth of User
 *
 */
private Date dob;
/**
 * mobileno of User
 *
 */
private long mobileNo;
/**
 * role of User
 *
 */
private long roleId;

private int unSuccessfulLogin;
/**
 * gender of User
 *
 */
private String gender;
/**
 * Last login of user
 *
 */
private Timestamp lastLogin;
private String lock = INACTIVE;
private String registeredIP;
private String lastLoginIP;
	
	public UserBean() {}
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public long getMobileNo() {
	return mobileNo;
}

public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}

public long getRoleId() {
	return roleId;
}

public void setRoleId(long roleId) {
	this.roleId = roleId;
}

public int getUnSuccessfulLogin() {
	return unSuccessfulLogin;
}

public void setUnSuccessfulLogin(int unSuccessfulLogin) {
	this.unSuccessfulLogin = unSuccessfulLogin;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Timestamp getLastLogin() {
	return lastLogin;
}

public void setLastLogin(Timestamp lastLogin) {
	this.lastLogin = lastLogin;
}

public String getLock() {
	return lock;
}

public void setLock(String lock) {
	this.lock = lock;
}

public String getRegisteredIP() {
	return registeredIP;
}

public void setRegisteredIP(String registeredIP) {
	this.registeredIP = registeredIP;
}

public String getLastLoginIP() {
	return lastLoginIP;
}

public void setLastLoginIP(String lastLoginIP) {
	this.lastLoginIP = lastLoginIP;
}

public static String getActive() {
	return ACTIVE;
}

public static String getInactive() {
	return INACTIVE;
}
	public String getKey() {
		return id + "";
	}

	public String getValue() {
		return firstName;
	}

	public int compareTo(BaseBean o) {
		return 0;
	}

	
}
