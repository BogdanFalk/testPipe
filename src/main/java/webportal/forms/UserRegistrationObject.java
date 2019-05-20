package webportal.forms;

/**
 * This entity is used to map the contents of the registration form
 * in order to be processed in the business logic.
 * @author uidw6860
 *
 */
public class UserRegistrationObject {
	
	private String m_zUsername;
	
	private String m_zPassword;
	
	private String m_zEmail;

	/**
	 * @return the m_zUsername
	 */
	public String getUsername() {
		return m_zUsername;
	}

	/**
	 * @param m_zUsername the m_zUsername to set
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
	 * @param m_zPassword the m_zPassword to set
	 */
	public void setPassword(String zPassword) {
		this.m_zPassword = zPassword;
	}

	/**
	 * @return the m_zEmail
	 */
	public String getEmail() {
		return m_zEmail;
	}

	/**
	 * @param m_zEmail the m_zEmail to set
	 */
	public void setEmail(String zEmail) {
		this.m_zEmail = zEmail;
	}
}
