 class Player {
    String name;
    int age;
    Player(String n,int a) {
        name=n; age=a;
    }
    void show() {
        System.out.println("");
        System.out.println("Player name : "+name);
        System.out.println("Age : "+age);
    }
}
class criket_player extends Player {
    String type;
    criket_player(String n,String t,int a) {
        super(n,a);
        type=t;
    }
    public void show() {
        super.show();
        System.out.println("Player type : "+type);
    }
}
class football_player extends Player {
    String type;
    football_player(String n,String t,int a) {
        super(n,a);
        type=t;
    }
    public void show() {
        super.show();
        System.out.println("Player type : "+type);
    }
}
class hockey_player extends Player {
    String type;
    hockey_player(String n,String t,int a) {
        super(n,a);
        type=t;
    }
    public void show() {
        super.show();
        System.out.println("Player type : "+type);
    }
}
class name {
    public static void main(String args[]) {
        criket_player c=new criket_player("Virat","Criket",36);
        football_player f=new football_player("Ronaldo","Football",40);
        hockey_player h=new hockey_player("Mandeep","Hockey",43);
        c.show();
        f.show();
        h.show();
    }
}
