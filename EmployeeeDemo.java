package in.ac.kletech.Employeee;

public class EmployeeeDemo {

		public static void main(String[] args) {
			Employeee deepika=new Employeee(1, "deepika", 100000);
			
			System.out.println("employee id :"+deepika.getiEmpID());
			System.out.println("employee name:"+deepika.getsEmpName());
			System.out.println("basic salary:"+deepika.getfEmpBasicSalary());
			deepika.calculateallowance();
			deepika.calculategrosssalary();
			deepika.calculatenetsalary();

		}
}