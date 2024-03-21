public class T18_student {
    int rollno ;
    String name;
    T18_student(int rollno){
        this.rollno = rollno;
    }
    T18_student(int rollno , String name){
        this.rollno = rollno;
        this.name = name;
    }
    T18_student(){
        this.rollno=46;
        this.name = "Ashmit p";
    }

    public static void main(String[] args) {
        T18_student obj = new T18_student();
        T18_student obj1 = new T18_student(34);
        T18_student obj2 = new T18_student(344,"Ashmit");
    }
}
