public class T13_fullPrice {
    int ag1;
    int age2;
    T13_fullPrice(int age1 , int age2){
        this.ag1=age1;
        this.age2=age2;
    }
    void print(){
        if(ag1<10 && age2>60){
            System.out.println("Discout price");
        }else{
            System.out.println("FullPrice");
        }
    }
    public static void main(String[] args) {
        T13_fullPrice fp= new T13_fullPrice(3,62);
        fp.print();
        T13_fullPrice pf= new T13_fullPrice(11,67);
        pf.print();
    }
}
