package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.WorkService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessDataResult;
import kodlamaio.northwind.core.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.WorkPositionDao;
import kodlamaio.northwind.entities.concretes.WorkPosition;
@Service
public class WorkManager implements WorkService{
	private WorkPositionDao dao;
	@Autowired
	public WorkManager(WorkPositionDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public DataResult<List<WorkPosition>> getAll() {
		return new SuccessDataResult<List<WorkPosition>>(this.dao.findAll(),"Isler listelendi!");
	}
	@Override
	public Result add(WorkPosition position) {
		this.dao.save(position);
		return new SuccessResult(true,"Is ugurla elave olundu!");
	}
	
}
