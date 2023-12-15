package hacettepe.bilisim.core.utilities.results;

public class ErrorResult extends Result {

	public ErrorResult( String message) {
		super(false, message);

	}

	public ErrorResult() {
		super(false);

	}

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
