package application.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Company;
import application.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Resource
	private CompanyService companyService;
	
	@RequestMapping("/save")
	public String save() {
		Company company = new Company();
		company.setName("测试添加数据");
		companyService.save(company);
		return "CompanyController.save";
	}
	
}
