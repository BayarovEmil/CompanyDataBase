package kodlamaio.northwind.core.results;

public class ErrorResult extends Result{
	public ErrorResult(boolean success,String message) {
		super(false,message);
	}
	public ErrorResult(boolean success) {
		super(false);
	}
}
