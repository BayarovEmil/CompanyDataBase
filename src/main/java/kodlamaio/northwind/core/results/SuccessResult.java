package kodlamaio.northwind.core.results;

public class SuccessResult extends Result{
	public SuccessResult(boolean success,String message) {
		super(true,message);
	}
	public SuccessResult(boolean success) {
		super(true);
	}
}
