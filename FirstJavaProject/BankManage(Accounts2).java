import java.util.Scanner;
public class BankManage {
private static Scanner sc;

public static void main(String[] args) {
        
        Accounts obj1=new Accounts();
        obj1.takeTotalAmount(5000);
        boolean exit = false;
        while(!exit)
        {

            System.out.println("-------------------------");
            System.out.println("Hello Welcome to the bank System");
            System.out.println("1 = Show Blance");
            System.out.println("2 = withdrowal Amount");
            System.out.println("3 = Deposite amount");
            System.out.println("4 = For Special Persone Set Balance");
            System.out.println("5 = Exit");
            System.out.println("-------------------------");
    
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Your Current balance is : "+obj1.total_A);
                    break;
    
                case 2:
    
                    System.out.print("Enter Withdrowal Amount : ");
                    int wa=sc.nextInt();
                    
                    if(obj1.total_A<wa)
                    {
                        System.out.println("Your account balance are not sufficiant to full fill this amount");
                    }
                    else{
                        
                        if(obj1.total_A-wa<1000)
                        {
                            System.out.println("You can not withdrowl this amount");
                        }
                        else{
                            
                            obj1.withdrawalmath(wa);
                            System.out.println("Congrates! You withdraw this amount : "+obj1.withdrawal);
                            System.out.println("Your Current balance is : "+obj1.total_A);
                        }
                    }
                    break;
    
                case 3:
                    System.out.print("Enter Deposit Amount : ");
                    int depo=sc.nextInt();
                    obj1.deposit(depo);
                    
                    System.out.println("Congrates! You Deposite this amount : "+depo);
                    System.out.println("Your Current balance is : "+obj1.total_A);
                break;
    
                case 4:
    
                System.out.print("Enter Password : ");
                int pass=sc.nextInt();
    
                if(pass==1234)
                {
                    System.out.print("Enter Balance Amount : ");
                    int bal=sc.nextInt();
                    
                    obj1.setbalance(bal);
    
                    System.out.println(obj1.total_A);
                }
                else{
                    System.out.println("Please Enter valid password to access Blance");
                }
    
                
                break;
            
                case 5:
                exit=true;
                break;
    
                default:
                System.out.println("Please Enter Any of this Choise");
                    break;
            }
        }
		sc.close();
        // obj1.deposit(5000);
    }
}
