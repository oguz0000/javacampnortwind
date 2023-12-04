package kodlamaio.northwind.core.utilities.results;

public abstract class DataResult<T> extends Result {

	protected T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}

	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}

	public abstract T getData() ;
	

}
