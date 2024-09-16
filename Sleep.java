import java.util.*;
class Sleep{
    static String Sleptat;
    static String Wokeupat;
    static Scanner input;
    
    public static void main(String args[])
    {
    System.out.println("Name: Muditt Sharmma,\n Sap ID : 500091725, \n Roll no. : R2142210506");
    input = new Scanner(System.in);
    setinfo();
    getinfo();
    }
    
    public static void setinfo(){
        System.out.println("Slept at:");
        Sleptat=input.next();
        System.out.println("Woke up at:");
        Wokeupat=input.next();
    }
    
    public static void getinfo(){
    System.out.println("Slept From:"+Sleptat);
    System.out.println("Till:"+Wokeupat);
    }
}
