package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.VacancyService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessDataResult;
import kodlamaio.northwind.core.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.VacancyDao;
import kodlamaio.northwind.entities.concretes.Vacancy;
@Service
public class VacancyManager implements VacancyService{
	private VacancyDao vacancyDao;
	@Autowired
	public VacancyManager(VacancyDao vacancyDao) {
		super();
		this.vacancyDao = vacancyDao;
	}

	@Override
	public DataResult<List<Vacancy>> getAll() {
		return new SuccessDataResult<List<Vacancy>>(this.vacancyDao.findAll());
	}

	@Override
	public Result add(Vacancy vacancy) {
		this.vacancyDao.save(vacancy);
		return new SuccessResult(true,"Vakansiya elave olundu!");
	}

	@Override
	public DataResult<List<Vacancy>> findBySalaryMin(int salaryMin) {
		return new SuccessDataResult<List<Vacancy>>(this.vacancyDao.findBySalaryMin(salaryMin),"Ugurla tapildi");
	}

	@Override
	public DataResult<List<Vacancy>> getByCompanyId(int companyId) {
		return new SuccessDataResult<List<Vacancy>>(this.vacancyDao.getByCompany_CompanyId(companyId),"Sirket tapildi!");
	}

	@Override
	public DataResult<List<Vacancy>> getSorted() {
    	Sort sort=Sort.by(Sort.Direction.ASC,"date");
    	return new SuccessDataResult<List<Vacancy>>
    	(this.vacancyDao.findAll(sort),"Tarixe gore listelendi");
	}

	@Override
	public DataResult<Vacancy> deleteById(int id) {
		this.vacancyDao.deleteById(id);
		return new SuccessDataResult<Vacancy>("Ugurla silindi");
	}	
}
