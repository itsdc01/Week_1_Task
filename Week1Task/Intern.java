package Week1Task;

public class Intern extends Employee {
	String name;
	int id;
	
	public Intern(String name,int id,double baseSalary, int attendanceDays, int performanceRating) {
		super(baseSalary, attendanceDays, performanceRating);
		
	}
	
	@Override
	public double grossSalary() {
		int attendancePercent = (getAttendanceDays() / 30 * 100);
		if(attendancePercent<70)
		{
			return getBaseSalary() - (getBaseSalary() * 0.20);
		}
		else
		{
			return getBaseSalary();
		}
	}
	

}

