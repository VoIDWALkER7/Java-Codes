class Calculator{
  public static void main(String args[]){
  System.out.println("Name: Muditt Sharmma,Sap ID : 500091725, Roll no. : R2142210506");
  Double a,b,Sum,Dif,Prod,Quoet,Rem;
     a=Double.parseDouble(args[0]);
  b=Double.parseDouble(args[1]);
  
  Sum=a+b;
  Dif=a-b;
  Prod=a*b;
  Quoet=a/b;
  Rem=a%b;
  
  System.out.println("the sum of the no is:"+Sum);
  System.out.println("the subtraction of the no is:"+Dif);
  System.out.println("the Multiplication of the no is:"+Prod);
  System.out.println("the Division of the no is:"+Quoet);
  System.out.println("the Remainder of the no is:"+Rem);  
   
  }
}
