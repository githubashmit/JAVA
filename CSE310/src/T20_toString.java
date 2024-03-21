public class T20_toString {
    String id;
    String name;
    int age;
    String gender;
    T20_toString(String id , String name , int age , String gender){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setname(String name){
        this.name = name;
    }

    public void setage(String id){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public static void main(String[] args) {
        T20_toString obj = new T20_toString("102" , "shiv",12,"M");
        System.out.println(obj);
    }
}
