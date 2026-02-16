package Week1Task;

public interface SalaryCalculation{
	
	double PF_PERCENT = 0.12;
	double grossSalary();
	double attendanceDeduction();
	double performanceBonus(double GrossSalary);
	double pfDeduction();
	double taxCalculation(double GrossSalary, double Bonus);
	void SalaryDetails();
}