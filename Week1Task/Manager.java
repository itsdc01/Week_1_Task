package Week1Task;

public class Manager extends Employee {
	

	String name;
	int id;
	int teamSize;
	public Manager(String name,int id,int teamSize,double baseSalary, int attendanceDays, int performanceRating) {
		super(baseSalary, attendanceDays, performanceRating);
		this.name=name;
		this.id=id;
		this.teamSize=teamSize;
		}

	@Override
	public double grossSalary() {
		return getBaseSalary()+(teamSize*1000);
	}
	

}
