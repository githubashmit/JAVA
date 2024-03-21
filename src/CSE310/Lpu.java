package CSE310;

public class Lpu {
    int display1(){
        int roll_number = 9;
        return roll_number;
    }
    String display2(){
        String name = "Ashmit";
        return name;
    }
    public static void main(String[] args) {
        Lpu l = new Lpu();
        System.out.println(l.display1());
        System.out.println(l.display2());
    }
}
