package in.ac.kletech.University;

public class UniversityDemo {
		public static void main(String[] args) {
			University u=new University("E30", "E241");
			System.out.println("CET Code of KLE Technological University:"+u.getCETCode1()+" and "+u.getCETCode2());
			u.Schools();
			u.calculateStrength();
		}

	}
