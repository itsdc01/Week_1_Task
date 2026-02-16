package Week1Task;

public class MinimumSalaryException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Base salary cannot be negative";
	}

}
