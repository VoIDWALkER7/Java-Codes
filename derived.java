class Student1{
    String name;
    private int age,rollno;
    void setage(int age) {
        this.age=age;
    }
    int getage() {
            return age;
    }
    void setroll(int rollno) {
        this.rollno=rollno;
    }
    int getroll() {
        return rollno;
    }
    void print() {
        System.out.println(name+" "+age+" "+rollno);
    }
}
 class derived extends Student1 {
    public static void main(String[] args) {
        Student1 obj= new Student1();
        obj.name="Akshat";
        obj.setage(17);
        obj.setroll(9);
        System.out.println(obj.name+" "+obj.getage()+" "+obj.getroll());
        obj.print();
    }
}
