class ConstructorOverloading
{
   private int Rupee;
   ConstructorOverloading()
   {
      Rupee =49;
   }
   ConstructorOverloading(int r)
   {
    this();
    Rupee = Rupee+ r;

   }
   public int getRupee(){
      return Rupee;
   }
   public void setRupee(int Rupee) {
      this.Rupee = Rupee;
   }
   public static void main(String args[])
   {
       ConstructorOverloading obj = new ConstructorOverloading(12);
       System.out.println(obj.getRupee());
    }
}
