public class T19_Student {
    int id;
    String name;
    int age;
    String gender;
    T19_Student(int id , String name , int age, String gender){
        this.id = id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String toString(){
        return id+" "+name+" "+age+" "+gender;
    }

    public static void main(String[] args) {
        T19_Student obj = new T19_Student(23,"AShmit",19,"male");
        System.out.println(obj);
    }
}