package application.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Car;
import application.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Resource
	private CarService carService;
	
	@RequestMapping("/save")
	public String save() {
		Car car = new Car();
		car.setName("测试添加car");
		car.setGrade(10);
		carService.save(car);
		return "CarController.save";
	}
	
	@RequestMapping("/{id}")
	public Car getById(@PathVariable int id) {
		return carService.getById(id);
	}
	
}
