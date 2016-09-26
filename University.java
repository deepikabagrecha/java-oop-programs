package in.ac.kletech.University;

final public class University {
	//private static final int 0 = 0;
	String CETCode1;
	String CETCode2;
	
	
	public University(String cETCode1, String cETCode2)
	{
		CETCode1 = cETCode1;
		CETCode2 = cETCode2;
	}


	public String getCETCode1() {
		return CETCode1;
	}


	public String getCETCode2() {
		return CETCode2;
	}
	
	School[] s=new School[8];
	
	void Schools()
	{
		s[0]=new School(100,"Priya Kumari",110,30);
		s[1]=new School(101,"Anil Kumar",150,40);
		s[2]=new School(102,"Ashwin Patel ",120,39);
		s[3]=new School(103,"Kiran Sharma",100,25);
		s[4]=new School(104,"Kaira Mithal",200,50);
		s[5]=new School(105,"Kamal Goudar",119,33);
		s[6]=new School(106,"Kria Pai",108,28);
		s[7]=new School(107,"Kundan Shah",154,45);
	}
	
	void calculateStrength()
	{
		int i=0;
		for(i=0;i<8;i++)
		{
			if(s[i].noOfStud>120)
			{
				System.out.println("The No. of Students in "+s[i].iprogramCode+" are "+s[i].noOfStud+" that are exceeding 120");
			}
			else
			{
				System.out.println("The No. of Students in "+s[i].iprogramCode+" are "+s[i].noOfStud);
			}
		}
	}
}
