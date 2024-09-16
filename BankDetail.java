import java.util.*;

class BankDetail{
    static String Name;
    static int AccountNumber;
    static int Balance;
    static int Deposit;
    static int Withdraw;
    static Scanner input;
 
    public static void main(String[] args){
    input = new Scanner(System.in);0
    setinfo();
    getinfo();
    }
     
    public static void setinfo(){
    System.out.println("Name:");
    Name=input.next();
    System.out.println("AccountNumber");
    AccountNumber=input.nextInt();
    System.out.println("Balance:");
    Balance=input.nextInt();
    System.out.println("Deposit:");
    Deposit=input.nextInt();
    System.out.println("Withdraw");
    Withdraw=input.nextInt();
    }
        
        
    public static void getinfo(){
    System.out.println("Bank Details:");
    System.out.println("Name:"+Name);
    System.out.println("AccountNumber:"+AccountNumber);
    System.out.println("Deposited:"+Deposit);
    System.out.println("Withdrawn:"+Withdraw);
    System.out.println("Balance:"+(Balance+Deposit-Withdraw));
    }
}





