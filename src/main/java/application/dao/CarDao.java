package application.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import application.model.Car;
import application.sql.PrimaryKeyHodler;

@Repository
public class CarDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	private String save = "insert into cars(name,grade) values(?,?)";
	
	private String getById = "select * from cars where id = ?";
	
	public void save(Car car) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		Object[] args = {car.getName(),car.getGrade()};
		jdbcTemplate.update(new PrimaryKeyHodler(save, args), keyHolder);
		car.setId(keyHolder.getKey().intValue());
	}
	
	public Car getById(int id) {
		RowMapper<Car> bean = new BeanPropertyRowMapper<Car>(Car.class);
		return jdbcTemplate.queryForObject(getById, bean);
	}
	
}
