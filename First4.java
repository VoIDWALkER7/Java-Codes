import java.util.*;

class First4{
   public static void main(String [] args){
    System.out.println("Name: Muditt Sharmma,Sap ID : 500091725, Roll No.: R2142210506");
     
  Scanner input = new Scanner(System.in);

       System.out.print("Enter the number for the month: ");
       int i = input.nextInt();
    
   switch(i){
   case 1:
   System.out.println("January");
   break;
   case 2:
   System.out.println("Febuary");
   break;
   case 3:
   System.out.println("March");
   break;
   case 4:
   System.out.println("April");
   break;
   case 5:
   System.out.println("May");
   break;
   case 6:
   System.out.println("June");
   break;
   case 7:
   System.out.println("July");
   break;
   case 8:
   System.out.println("August");
   break;
   case 9:
   System.out.println("September");
   break;
   case 10:
   System.out.println("October");
   break;
   case 11:
   System.out.println("November");
   break;
   case 12:
   System.out.println("December");
   break;
   default:
   System.out.println("There is an error with the user input");
   }
   
  }
}

