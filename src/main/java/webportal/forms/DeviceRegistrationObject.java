package webportal.forms;

/**
 * This entity is used to map the contents of the new device registration form
 * in order to be processed in the business logic.
 * @author uidw6860
 *
 */
public class DeviceRegistrationObject {
	
	private String m_zVehicleNumber;
	
	private String m_zVIN;
	
	private String m_zDeviceSerialNumber;
	
	public DeviceRegistrationObject() {
		super();
	}

	/**
	 * @return the m_zVehicleNumber
	 */
	public String getVehicleNumber() {
		return m_zVehicleNumber;
	}

	/**
	 * @param m_zVehicleNumber the m_zVehicleNumber to set
	 */
	public void setVehicleNumber(String zVehicleNumber) {
		this.m_zVehicleNumber = zVehicleNumber;
	}

	/**
	 * @return the m_zVIN
	 */
	public String getVIN() {
		return m_zVIN;
	}

	/**
	 * @param m_zVIN the m_zVIN to set
	 */
	public void setVIN(String zVIN) {
		this.m_zVIN = zVIN;
	}

	/**
	 * @return the m_zDeviceSerialNumber
	 */
	public String getDeviceSerialNumber() {
		return m_zDeviceSerialNumber;
	}

	/**
	 * @param m_zDeviceSerialNumber the m_zDeviceSerialNumber to set
	 */
	public void setDeviceSerialNumber(String zDeviceSerialNumber) {
		this.m_zDeviceSerialNumber = zDeviceSerialNumber;
	}
	
}
