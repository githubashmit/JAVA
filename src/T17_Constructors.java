class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName,int myId){
        id = myId;
        name= myName;
    }
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public void setId(int i){this.id=i;}
    public int getId(){return id;}
}
public class T17_Constructors {
    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee( "Codewithharry",87);
        MyMainEmployee harry = new MyMainEmployee();
//       harry.setName("Codewithharry");
//        harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());


    }
}
