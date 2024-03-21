class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a=v;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor hoon");
    }
}
public class T21_this_Super_Keyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
