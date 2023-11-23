package kodlamaio.northwind.buissness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.Vacancy;

public interface VacancyService {
	DataResult<List<Vacancy>> getAll();
	Result add(Vacancy vacancy);
	
	DataResult<List<Vacancy>> getByCompanyId(int companyId);
	
//	DataResult<Vacancy> getById(int id);
	
	DataResult<List<Vacancy>> findBySalaryMin(int salaryMin);
	
	DataResult<List<Vacancy>> getSorted();
	
	DataResult<Vacancy> deleteById(int id);
}
