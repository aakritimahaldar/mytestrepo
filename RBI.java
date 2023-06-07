class RBI {
    public void printDetails() {
        System.out.println("This is RBI - Reserve Bank of India.");
    }
}

class SBI extends RBI {
    @Override
    public void printDetails() {
        System.out.println("This is SBI - State Bank of India.");
    }
}

public class bank {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        SBI sbi = new SBI();
        
        rbi.printDetails(); // Output: This is RBI - Reserve Bank of India.
        sbi.printDetails(); // Output: This is SBI - State Bank of India.
    }
}
