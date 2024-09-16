
class Polymorphism {
    static void sum(int a, int b)
    {
        System.out.println("Sum of the integers: "+(a+b));
    }
    static void sum(double a, double b)
    {
        System.out.println("Sum of the doubles: "+(a+b));
    }
   
    public static void main(String[] args)
    {
        sum(1, 2);
       
        sum(1.2, 2.4);
    }
}

