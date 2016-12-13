package application.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import application.dao.CarDao;
import application.model.Car;

@Service
public class CarService {

	@Resource
	private CarDao carDao;
	
	public void save(Car car) {
		carDao.save(car);
	}
	
	public Car getById(int id) {
		return carDao.getById(id);
	}
	
}
