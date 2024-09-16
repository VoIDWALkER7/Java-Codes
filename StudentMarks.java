import java.util.*;

class StudentMarks{
    static String Name;
    static int Rollno;
    static String Branch;
    static Scanner input;
    static int PhysicsPer;
    static int ChemistryPer;
    static int MathsPer;
    static int Aggregate;
 
    public static void main(String[] args){
    System.out.println("Name: Muditt Sharmma,\n Sap ID : 500091725, \n Roll no. : R2142210506");
    input = new Scanner(System.in);
    setinfo();
    getinfo();
    sorted();
    }
     
    public static void setinfo(){
    System.out.println("Name:");
    Name=input.next();
    System.out.println("Roll no:");
    Rollno=input.nextInt();
    System.out.println("Branch:");
    Branch=input.next();
    System.out.println("Physics Percentage:");
    PhysicsPer=input.nextInt();
    System.out.println("Chemistry Percentage:");
    ChemistryPer=input.nextInt();
    System.out.println("Maths Percentage:");
    MathsPer=input.nextInt();
    System.out.println("");
    }

    public static void getinfo(){
    System.out.println("Student Details:");
    System.out.println("Name:"+Name);
    System.out.println("Roll no:"+Rollno);
    System.out.println("Branch:"+Branch);
    System.out.println("");
    }
    
    public static void sorted(){
       System.out.println("Physics Percentage:"+PhysicsPer);
       if(PhysicsPer<100 && PhysicsPer<40){
       System.out.println("You failed in physics");
       }
       else if(PhysicsPer<100 && PhysicsPer>75){
       System.out.println("You scored a distinction in physics");
       }
       else if(PhysicsPer<100 && PhysicsPer>=40){
       System.out.println("You passed");
       }
       else{
       System.out.println("INVALID");
       }
       System.out.println("");
       
       System.out.println("Chemistry Percentage:"+ChemistryPer);
       if(ChemistryPer<100 && ChemistryPer<40){
       System.out.println("You failed in Chemistry");
       }
       else if(ChemistryPer<100 && ChemistryPer>75){
       System.out.println("You scored a distinction in Chemistry");
       }
       else if(ChemistryPer<100&& ChemistryPer>=40){
       System.out.println("You passed");
       }
       else{
       System.out.println("INVALID");
       }
       System.out.println("");
       
       System.out.println("Maths Percentage:"+MathsPer);
       if(MathsPer<100 && MathsPer<40){
       System.out.println("You failed in Maths");
       }
       else if(MathsPer<100 && MathsPer>75){
       System.out.println("You scored a distinction in Chemistry");
       }
       else if(MathsPer<100&& MathsPer>=40){
       System.out.println("You passed");
       }
       else{
       System.out.println("INVALID");
       }
       System.out.println("");
       
       Aggregate=(PhysicsPer+MathsPer+ChemistryPer)/3;
       System.out.println("Aggregate:"+Aggregate);
       if(Aggregate<100 && Aggregate<40){
           System.out.println("You have failed. You have to repeat a year");
       }
       else if(Aggregate<100 && Aggregate>75){
           System.out.println("You have scored a distinction");
       }
       else if(Aggregate>=40 && Aggregate<50){
           System.out.println("You passed Third Division");
       }
       else if(Aggregate>=50 && Aggregate<60){
           System.out.println("You passed Second Division");
       }
       else if(Aggregate>=60 && Aggregate<75){
           System.out.println("You passed First Division");
       }
       else{
           System.out.println("INVALID");
       }
    }
    
}





