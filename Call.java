class TrunkCall{
    String type;
    float duration;
    TrunkCall( String type,float duration){
        this.type=type;
        this.duration=duration;
    }
    void display() {
        System.out.println("Call type is "+type);
        System.out.println("Call duration is "+duration);
    }
}
class Normal extends TrunkCall{
    float rate=2.0f;
    Normal(String type,float duration){
        super(type,duration);
    }
    float charges(){
        return duration*rate;
    }
    void display() {
        super.display();
        System.out.println("total cost is:"+charges());
    }
}
class Urgent extends TrunkCall{
    float rate=3.5f;
    Urgent(String type,float duration){
        super(type,duration);
    }
    float charges(){
        return duration*rate;
    }
    void display() {
        super.display();
        System.out.println("total cost is:"+charges());
    } }
class Lightning extends TrunkCall{
    float rate=4.5f;
    Lightning(String type,float duration){
        super(type,duration);
    }
    float charges(){
        return duration*rate;
    }
    void display() {
        super.display();
        System.out.println("total cost is:"+charges());
    }}
class Call {
    public static void main(String[] args) {
        Normal obj1 =new Normal("normal",10.5f);
        obj1.display();
        Urgent obj2 =new Urgent("urgent",11.2f);
        obj2.display();
        Lightning obj3 =new Lightning("Lightning",8.4f);
        obj3.display();
    }

}

