package application.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import application.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Serializable> {

	
	
	
}
