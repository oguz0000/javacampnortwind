package hacettepe.bilisim.core.utilities.results;

public abstract class Result {
	protected boolean success;
	protected String message;

	public Result(boolean success) {
		super();
		this.success = success;
	}

	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}
	public abstract boolean isSuccess() ;
	
	public abstract String getMessage() ;
}
