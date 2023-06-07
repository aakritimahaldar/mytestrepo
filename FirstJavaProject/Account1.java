public class Account1{
	    public static void main(String[] args) {
	        Account myAccount = new Account(10000); 
	        myAccount.withdraw(7000); 
	        double newBalance = myAccount.getBalance();

	        if(newBalance >= 1000)
	        {
	           System.out.println(newBalance);
	        }
	    }
	}
