class Bed{
    String Btype="Single Bed";
}

class SoldBed extends Bed{
    int SoldAt=2000;


    public static void main(String args[]){
        SoldBed SB = new SoldBed();
        System.out.println("The bed was a"+SB.Btype);
        System.out.println("The bed was sold at"+SB.SoldAt);
    }
}
