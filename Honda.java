abstract class Bike
{
    abstract void run();
    void speed(){// non abstract method
    System.out.println("I AM SPEED");}
    
}

class Honda extends Bike
{
    void run(){
        System.out.println("Overrident Method run()");
    }
    public static void main(String... args){
        //Bike obj = new Bike();
        Honda obj = new Honda();
        obj.run();
    }
    
}
