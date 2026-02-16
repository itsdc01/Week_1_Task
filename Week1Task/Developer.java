package Week1Task;

public class Developer extends Employee{
	
	String name;
	int id;
	double overTimeHr;
	
	public Developer(String name,int id,double overTimeHr,double baseSalary, int attendanceDays, int performanceRating) {
		super(baseSalary, attendanceDays, performanceRating);
		this.name=name;
		this.id=id;
		this.overTimeHr=overTimeHr;
	}
	
	@Override
	public double grossSalary() {
		return getBaseSalary()+(overTimeHr*500);
	}
	

}
