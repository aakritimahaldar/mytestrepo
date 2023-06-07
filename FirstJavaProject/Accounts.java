

public class Accounts {

	    double total_A,withdrawal,Deposit;

	    public void takeTotalAmount(double to_a)
	    {
	        this.total_A=to_a;
	    }

	    public void withdrawalmath(double with_a) {
	        this.withdrawal=with_a;
	        
	      
	            total_A=total_A-withdrawal;
	    }


	    public void deposit(double dep) {
	        total_A=total_A+dep;
	    }

	    public void setbalance(double bal) {
	        this.total_A=bal;        
	    }
	}

