package Week1Task;

public class MinimumAttendanceException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Attendance must be between 0 and 30";
	}

}
