package webportal.forms;

/**
 * This entity is used to map the contents of the login form
 * in order to be processed in the business logic.
 * @author uidw6860
 *
 */
public class UserLoginObject {
	
	private String m_zUsername;
	
	private String m_zPassword;

	public UserLoginObject() {
		super();
	}

	/**
	 * @return the m_zUsername
	 */
	public String getUsername() {
		return m_zUsername;
	}

	/**
	 * @param zUsername the m_zUsername to set
	 */
	public void setUsername(String zUsername) {
		this.m_zUsername = zUsername;
	}

	/**
	 * @return the m_zPassword
	 */
	public String getPassword() {
		return m_zPassword;
	}

	/**
	 * @param zPassword the m_zPassword to set
	 */
	public void setPassword(String zPassword) {
		this.m_zPassword = zPassword;
	}
}
