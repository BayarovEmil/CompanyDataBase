package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.CityService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessDataResult;
import kodlamaio.northwind.core.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.CityDao;
import kodlamaio.northwind.entities.concretes.City;
@Service
public class CityManager implements CityService{
	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult(true,"Seher bilgisi elave olundu!");
	}
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Seher tapildi");
	}
	
	
}
