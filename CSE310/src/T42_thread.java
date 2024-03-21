class student extends Thread{
    public void run(){
        for(int i = 0 ; i<10 ; i++){
            System.out.println("Student");
        }
    }
}
public class T42_thread {
    public static void main(String[] args) {
        student obj = new student();
        obj.start();
        for(int i = 0 ;i < 10 ; i++){
            System.out.println("Main thread");
        }
    }
}
