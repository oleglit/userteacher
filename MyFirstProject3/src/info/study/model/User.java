package info.study.model;

public abstract class User {

	private String login;
	private String pass;
	private String firstName;
	private String secondName;
	private String group;
	private User faculty;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public User getFaculty() {
		return faculty;
	}
	public void setFaculty(User faculty) {
		this.faculty = faculty;
	}
	
	
}
