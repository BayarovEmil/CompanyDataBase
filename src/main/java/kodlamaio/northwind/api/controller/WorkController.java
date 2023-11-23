package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.buissness.abstracts.WorkService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.WorkPosition;

@RestController
@RequestMapping("/api/workPosition")
public class WorkController {
	private WorkService workService;
	@Autowired
	public WorkController(WorkService workService) {
		super();
		this.workService = workService;
	}
	
	@GetMapping("/getAllWorkPosition")
	public DataResult<List<WorkPosition>> getAll(){
		return this.workService.getAll();
	}
	
	@PostMapping("/addWorkPostion")
	public Result add(@RequestBody WorkPosition workPosition) {
		return this.workService.add(workPosition);
	}
}
