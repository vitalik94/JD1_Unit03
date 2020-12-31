package by.htp.task08.main.Customer;

public class ChartCustomer {
	
	private Customer[] сustom;
	private int Groupсustomer;
	
	
	public ChartCustomer(int num){
		
		сustom = new Customer[num];
		Groupсustomer = 0;
	}
	
	public void add (Customer cu) {
		
		сustom[Groupсustomer] = cu;
		Groupсustomer++;

	}
	
	public void setCustomer(Customer[] сustom) {
		
		this.сustom = сustom;
	}
	
	public Customer[] getCustomer() {
		
		return сustom;
		
	}

}
