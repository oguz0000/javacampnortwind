package hacettepe.bilisim.core.utilities.results;

public class SuccessResult extends Result {

	public SuccessResult() {
		super(true);

	}

	public SuccessResult(String message) {
		super(true, message);

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
