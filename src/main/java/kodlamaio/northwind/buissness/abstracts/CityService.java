package kodlamaio.northwind.buissness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.City;

public interface CityService {
	Result add(City city);
	DataResult<List<City>> getAll();
	
}
