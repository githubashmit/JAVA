class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
    class CellPhone{
        public void ring(){
            System.out.println("Ringning....");
        }
        public void vibrating(){
            System.out.println("Vibrating....");
        }
        public void callFriend(){
            System.out.println("calling ...");
        }
    }
    class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
    }
    class Tommy{
        public void hit(){
            System.out.println("Hitting the enemey");
        }
        public void run(){
            System.out.println("Running from the enemy");
        }
        public void fire(){
            System.out.println("Firing on  the enemey");
        }
    }

public class T14_oopsques {
    public static void main(String[] args){
//        //Problem 1
//        Employee1 harry = new Employee1();
//        harry.setName("Codewith harry");
//        harry.salary = 233;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());
//
//        //problem 2
//        CellPhone asus = new CellPhone();
//        asus.callFriend();
//        asus.vibrating();
//        asus.ring();
//
//        //Priblem 3
//        Square sq = new Square();
//        sq.side = 4;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        //Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
