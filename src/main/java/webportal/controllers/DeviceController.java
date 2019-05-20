package webportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * The DeviceController class is responsible for handling device specific routes.
 * @author uidw6860
 *
 */
@Controller
public class DeviceController {

	@GetMapping("/device/show")
	public ModelAndView handleDeviceInfoPage() {
		ModelAndView deviceInfo = new ModelAndView();
		
		deviceInfo.setViewName("device/show");
		
		return deviceInfo;
	}
	
	@GetMapping("/device/add")
	public ModelAndView showAddDevicePage() {
		ModelAndView deviceInfo = new ModelAndView();
		
		deviceInfo.setViewName("device/create");
		
		return deviceInfo;
	}
	
}
