class worker{
    String empname;
    worker (String s) {
        empname=s;
    }
    void display() {
        System.out.println("Employee name is:"+empname);
    }
}
class dailyworker extends worker{
    int salary_rate;
    dailyworker(String name,int rate){
        super(name);
        salary_rate=rate;
    }
    void compay(int pay) {
        super.display();
        System.out.println( "Salary is:"+pay*salary_rate);
    }

}
class salariedworker extends worker{
    int salary_rate;
    int pay=40;
    salariedworker(String name,int rate){
        super(name);
        salary_rate=rate;
    }
    void compay() {
        super.display();
        System.out.println( "Salary is:"+pay*salary_rate);
    }
}

class WorkerPay {
    public static void main(String[] args) {
        dailyworker obj1 = new dailyworker("amit",250);
        salariedworker obj2 = new salariedworker("hari",300);
        obj1.compay(60);
        obj2.compay();

    }

}

