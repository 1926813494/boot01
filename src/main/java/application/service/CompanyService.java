package application.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import application.dao.CompanyRepository;
import application.model.Company;

@Service
public class CompanyService {

	@Resource
	private CompanyRepository companyRepository;
	
	@Transactional
	public void save(Company company) {
		companyRepository.save(company);
	}
	
}
