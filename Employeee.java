package in.ac.kletech.Employeee;

public class Employeee {
		private int iEmpID;
		private String sEmpName;
		private int fEmpBasicSalary;
		private float fAllowance;
		float netSalary;	
		double GrossSalary;
		double incometax;
		
		
		
		public int getiEmpID() {
			return iEmpID;
		}
		public String getsEmpName() {
			return sEmpName;
		}
		public int getfEmpBasicSalary() {
			return fEmpBasicSalary;
		}
		
		
		
		public Employeee(int iEmpID, String sEmpName, int fEmpBasicSalary) {
			this.iEmpID = iEmpID;
			this.sEmpName = sEmpName;
			this.fEmpBasicSalary = fEmpBasicSalary;
		}
		
		float calculateallowance()
		{
		fAllowance=(getfEmpBasicSalary()*46)/100;
		System.out.println("allowance:"+fAllowance);
		return fAllowance;
		}

		
		double calculategrosssalary()
		{
			GrossSalary=fAllowance+getfEmpBasicSalary();
			System.out.println("gross salary:"+GrossSalary);
			
			if(GrossSalary<5000){
				incometax=0;
				System.out.println("No tax to be paid");
				return incometax;
			}
			else if(GrossSalary>5000 && GrossSalary<=10000){
				incometax=(float) (GrossSalary*0.1);
				System.out.println("the income tax="+incometax);
				return incometax;
			}
			else if(GrossSalary>=10001 && GrossSalary<=20000){
				incometax=(float) (GrossSalary*0.2);
				System.out.println("the income tax="+incometax);
				return incometax;
				
			}
			else
				incometax=(float)(GrossSalary*0.3);
			System.out.println("the income tax="+incometax);
			return incometax;
		}
		
		void calculatenetsalary()
		{
		netSalary=(float) ((float) GrossSalary-incometax);
		System.out.println("netsalary="+netSalary);
	}
	}
