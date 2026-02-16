package Week1Task;

public class MinimumPerformanceRatingException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Rating must be between 1 and 5";
	}
	

}
