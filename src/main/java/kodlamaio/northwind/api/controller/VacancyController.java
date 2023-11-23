package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.buissness.abstracts.VacancyService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.Vacancy;
@RestController
@RequestMapping(value="/api/vacancy")
public class VacancyController {
	private VacancyService vacancyService;
	@Autowired
	public VacancyController(VacancyService vacancyService) {
		super();
		this.vacancyService = vacancyService;
	}
	
	@GetMapping("/getAllVacancy")
	public DataResult<List<Vacancy>> getAll(){
		return this.vacancyService.getAll();
	}
	
	@PostMapping("/addVacancy")
	public Result add(@RequestBody Vacancy vacancy) {
		return this.vacancyService.add(vacancy);
	}
	
	@GetMapping("/findBySalaryMin")
	public DataResult<List<Vacancy>> findBySalaryMin(int salaryMin){
		return this.vacancyService.findBySalaryMin(salaryMin);
	}
	
	@GetMapping("/getByCompanyId")
	public DataResult<List<Vacancy>> getByCompanyId(int companyId){
		return this.vacancyService.getByCompanyId(companyId);
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<Vacancy>> getAllSorted(){
		return this.vacancyService.getSorted();
	}
	
	@PostMapping("/deleteById")
	public DataResult<Vacancy> deleteById(int id) {
		return this.vacancyService.deleteById(id);
	}
}
