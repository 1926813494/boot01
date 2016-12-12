package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/zeroExce")
	public int zeroException() {
		int i = 100 / 0;
		return i;
	}
	
}
