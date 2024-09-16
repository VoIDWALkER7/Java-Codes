import java.util.*;

class StudentRec{
    static String Name;
    static int Rollno;
    static String Branch;
    static Scanner input;
 
    public static void main(String[] args){
    System.out.println("Name: Muditt Sharmma, Sap ID : 500091725, Roll no. : R2142210506");
    input = new Scanner(System.in);
    setinfo();
    getinfo();
    }
     
    public static void setinfo(){
    System.out.println("Name:");
    Name=input.next();
    System.out.println("Roll no:");
    Rollno=input.nextInt();
    System.out.println("Branch:");
    Branch=input.next();
    }
        
        

    public static void getinfo(){
    System.out.println("Student Details:");
    System.out.println("Name:"+Name);
    System.out.println("Roll no:"+Rollno);
    System.out.println("Branch:"+Branch);
    }
}





