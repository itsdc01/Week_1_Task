package Week1Task;

abstract  class Employee implements SalaryCalculation {
	private double baseSalary;
    private int attendanceDays;
    private int performanceRating;
    private static final int[] RATING = {0,5,10,15,20};
     
    public Employee(double baseSalary, int attendanceDays, int performanceRating) {
    	if(baseSalary < 0)
    	    throw new MinimumSalaryException();
    	this.baseSalary = baseSalary;

    	if(attendanceDays < 0 || attendanceDays > 30)
    	    throw new MinimumAttendanceException();
    	this.attendanceDays = attendanceDays;

    	if(performanceRating < 1 || performanceRating > 5)
    	    throw new MinimumPerformanceRatingException();
    	this.performanceRating = performanceRating;

	}
    
	@Override
    public double attendanceDeduction() {
    	double dailySalary = baseSalary / 30;
    	int absentDays = 30 - getAttendanceDays();
        return absentDays * dailySalary;
    }

    @Override
    public double performanceBonus(double grossSalary) {
    	
    	int percent=RATING[performanceRating-1];
    	return grossSalary * (percent/100.0);
    	
    }

    @Override
    public double pfDeduction() {
    	
    	return baseSalary *PF_PERCENT;
    }

    @Override
    public double taxCalculation( double grossSalary, double bonus) {
    	double taxableIncome = grossSalary + bonus;
    	int taxRate;
    	if(taxableIncome<=50000)
    		taxRate=5;
    	else if(taxableIncome>50000&&taxableIncome<=100000)
    		taxRate=10;
    	else if(taxableIncome>100000&&taxableIncome<=150000)
    		taxRate=15;
    	else
    		taxRate=20;
    	
    	return taxableIncome * (taxRate/100.0);
    }
    @Override
    public  void SalaryDetails() {
    	double gross = grossSalary();
    	double bonus=performanceBonus(gross);
    	double tax=taxCalculation(gross, bonus);
    	double pf=pfDeduction();
    	double attendanceDeduction=attendanceDeduction();
    	double net= gross + bonus - tax - pf - attendanceDeduction;	
    	System.out.println("\n-----------------------------");
        System.out.println("Gross Salary: " + gross);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax: " + tax);
        System.out.println("PF: " + pf);
        System.out.println("Attendance Deduction: " + attendanceDeduction);
        System.out.println("Net Salary: " + net);
        System.out.println("-----------------------------");
    }


	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getAttendanceDays() {
		return attendanceDays;
	}

	public void setAttendanceDays(int attendanceDays) {
		this.attendanceDays = attendanceDays;
	}
    
}