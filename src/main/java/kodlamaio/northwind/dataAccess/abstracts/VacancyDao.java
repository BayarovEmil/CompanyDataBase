package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Vacancy;

public interface VacancyDao extends JpaRepository<Vacancy, Integer>{
	List<Vacancy> getByCompany_CompanyId(int companyId);

	List<Vacancy> findBySalaryMin(int salaryMin);
}