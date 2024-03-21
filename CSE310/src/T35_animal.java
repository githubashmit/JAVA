public class T35_animal {
    String animalcolour="red";
    T35_animal(int a){

        System.out.println("Animal is created");
    }
    public void eat(){
        System.out.println("Eating something");
    }
}
 class Dog extends T35_animal{


    String animalcolour="white";
    Dog(){
        super(12);
        System.out.println("Dog is created");
    }
    public void eat(){
        System.out.println("Eating bread");
    }
    public void bark(){
        System.out.println("Barking");
    }
    public void work(){
        System.out.println(super.animalcolour);
        super.eat();
        eat();
        bark();
    }
}
class ExampleOnSuper{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.work();
        String animalcolour="brown";
        System.out.println(obj.animalcolour);
        //T35_animal obj1 = new T35_animal(23);
        //System.out.println(obj1.animalcolour);
    }
}
