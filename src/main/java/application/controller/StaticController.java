package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.utils.StaticUtils;

@RestController
@RequestMapping("/static")
public class StaticController {

	@RequestMapping("/bean")
	public String bean() {
		return StaticUtils.getValue();
	}
	
}
