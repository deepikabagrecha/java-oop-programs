package in.ac.kletech.University;

public class School {
		int iprogramCode;
		String schoolCoordinater;
		int noOfStud;
		int noOfStaff;
		
		
		public School(int iprogramCode, String schoolCoordinater, int noOfStud,
				int noOfStaff) 
		{
			this.iprogramCode = iprogramCode;
			this.schoolCoordinater = schoolCoordinater;
			this.noOfStud = noOfStud;
			this.noOfStaff = noOfStaff;
		}


		public int getIprogramCode() {
			return iprogramCode;
		}


		public String getSchoolCoordinater() {
			return schoolCoordinater;
		}


		public int getNoOfStud() {
			return noOfStud;
		}


		public int getNoOfStaff() {
			return noOfStaff;
		}
		

	}
