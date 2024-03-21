public class T45_outer {
    int x = 10 ; static int y = 20;
    void demo()
    {
        int z = 30;
        System.out.println("Local Class is loading...");
        class Local{
            int a = 10;
            void myLocal(){
                System.out.println("X="+x);
                System.out.println("Y="+y);
                System.out.println("Z="+z);
                System.out.println("A="+a);
            }
        }
        Local obj = new Local();  obj.myLocal();
    }
}
