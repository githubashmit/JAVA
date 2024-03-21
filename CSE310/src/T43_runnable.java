class students implements Runnable{
    public void run(){
        for(int i =0 ; i < 10 ;i++){
            System.out.println("Student");
        }
    }
}
public class T43_runnable {
    public static void main(String[] args) {
        Runnable obj = new students();
        Thread obj12 = new Thread(obj);
        obj12.start();
        for(int i =0 ; i < 10 ; i ++){
            System.out.println("Main thread");
        }
    }
}
