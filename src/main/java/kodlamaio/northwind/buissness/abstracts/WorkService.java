package kodlamaio.northwind.buissness.abstracts;

import java.util.List;


import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.WorkPosition;

public interface WorkService {
	DataResult<List<WorkPosition>> getAll();
	Result add(WorkPosition position); 
}
