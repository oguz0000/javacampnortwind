package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data, true, message);

	}

	public SuccessDataResult(T data) {
		super(data, true);

	}

	public SuccessDataResult() {
		super(null, true);

	}

	@Override
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return success;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
