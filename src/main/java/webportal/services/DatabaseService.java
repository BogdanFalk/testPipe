package webportal.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import webportal.forms.DeviceRegistrationObject;
import webportal.forms.UserRegistrationObject;

@Service
public class DatabaseService {
	
	// TODO: Add implementation using a database system.
	
	private List<UserRegistrationObject> m_UsersList;
	
	private List<DeviceRegistrationObject> m_DevicesList;
	
	public DatabaseService() {
		super();
		
		m_UsersList = new ArrayList<>();
		m_DevicesList = new ArrayList<>();
	}

	public List<UserRegistrationObject> getAllUsers() {
		return m_UsersList;
	}
	
	public void addUser(UserRegistrationObject newUser) {
		m_UsersList.add(newUser);
	}
	
	public List<DeviceRegistrationObject> getAllDevicesForUser(final int iUserId) {
		return m_DevicesList;
	}
	
}
