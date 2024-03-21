class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on phone .........");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void on(){
        System.out.println("My name is Java in Class two");
    }
}
public class T23_dynamicMethodDispatch {
    public static void main(String[] args) {
//    Phone obj = new Phone();  //Allowed
//    SmartPhone smobj = new SmartPhone();  //Allowed
//    obj.name();
        Phone obj = new SmartPhone();  // allowed
       // SmartPhone obj2 = new Phone();  // Not allowed
        obj.greet();
        obj.on();
        //obj.swagat();  // Error
    }
}
