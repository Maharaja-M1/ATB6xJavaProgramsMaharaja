package ATB6xJavaPrograms.OOPs;

public class atb6xClassDetails {

	public static void main(String[] args) {
		// Create Multiple class for the ATB6X project, Attribute, Behav, Course, Student, Payment.
		//Create Object of 3 students and assign the values.
		
		//Student 1 Details:
				studentInfo stud1=new studentInfo();
				stud1.name="Maharaja.M";
				stud1.ph_no=9876543210l;
				stud1.email="maharajatest@xyz.com";
				stud1.details();
				
				Payment pay1=new Payment();
				pay1.p_status=true;
				pay1.p_method="UPI";
				pay1.overdue_amnt=1000;
				pay1.paymentdetails();
				
				Course c1=new Course();
				c1.c_name="JavaCourse";
				c1.c_status="InProgress";
				c1.coursedetails();
				
				System.out.println("*********************************");
				
		//Student 2 Details:
				studentInfo stud2=new studentInfo();
				stud2.name="Shobana.M";
				stud2.ph_no=9876543210l;
				stud2.email="shobtest@xyz.com";
				stud2.details();
				
				Payment pay2=new Payment();
				pay2.p_status=true;
				pay2.p_method="UPI";
				pay2.overdue_amnt=2000;
				pay2.paymentdetails();
				
				Course c2=new Course();
				c2.c_name="JavaCourse";
				c2.c_status="InProgress";
				c2.coursedetails();
				System.out.println("*********************************");
				
		//Student 3 Details:
				studentInfo stud3=new studentInfo();
				stud3.name="Jayanth.M";
				stud3.ph_no=9876544210l;
				stud3.email="jaytest@xyz.com";
				stud3.details();
				
				Payment pay3=new Payment();
				pay3.p_status=true;
				pay3.p_method="CC";
				pay3.overdue_amnt=0;
				pay3.paymentdetails();
				
				Course c3=new Course();
				c3.c_name="JavaCourse";
				c3.c_status="NotStarted";
				c3.coursedetails();

		
	}

}
