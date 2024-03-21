interface Printer{
    public void printMe();
}
class Prefix{
    protected String prefix;
    public Prefix(String prefix){
        this.prefix= prefix;
    }
}
class Prefixer extends Prefix implements Printer {
    public Prefixer(String prefix) {
        super(prefix);
    }

    public void printMe() {
        System.out.println("Hello Hello James");
    }
}
class T45_interface {
    public static void main(String[] args){
        Printer printer = new Printer(){
            public void printMe(){
                System.out.println("printMe is called!");
            }
        };
        Prefixer doublePrefixer = new Prefixer("Helle"){
            public String getPrefixed(String name){
                return prefix + " "+ prefix + " "+ name;
            }
        };
        printer.printMe();
    }
}
