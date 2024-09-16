class Animal{
    void runs(){System.out.println("Animal runs very fast!!");}
}

class Jag extends Animal{
    void runs(){System.out.println("Jaguar runs very fast!!");}


public static void main(String... args){
    Jag J=new Jag();
    J.runs();
}
}
