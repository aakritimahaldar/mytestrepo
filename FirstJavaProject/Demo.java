
public class Demo {
	    
	    String Enrollno,result; 
	    
	    public String getenrollmenno()

	    {
	    
	    return Enrollno;
	    
	    } 
	    
	    public void setenrollno(String enrollno)	
	    
	    { 
	        this.Enrollno=enrollno;
	    } 
	    
	    @Override
	    
	    public String toString() 
	    { 
	        return ("Enrollment number = "+ getenrollmenno());
	    
	    }
	}
