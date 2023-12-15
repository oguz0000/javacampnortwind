package hacettepe.bilisim.core.utilities.results;



public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, boolean success, String message) {
		super(data, false, message);

	}

	public ErrorDataResult(T data, boolean success) {
		super(data, false);

	}

	public ErrorDataResult() {

		super(null, false);
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
