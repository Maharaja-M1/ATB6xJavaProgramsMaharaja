package ATB6xJavaPrograms.OOPs;

public class Payment {

	boolean p_status;
	String p_method;
	int overdue_amnt;
	
	public void paymentdetails() {
		System.out.println("Payment Status:" +p_status);
		System.out.println("Payment Method:" +p_method);
		System.out.println("Overdue Amount:" +overdue_amnt);
	}
	
}
