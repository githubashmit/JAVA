abstract class T36_ClacArea {
    public void triangleArea(double b , double h){
        System.out.println(0.5  * b *h);
    }
    public void rectangleArea(double l , double b){
        System.out.println(l*b);
    }
    public void squareArea(double s){
        System.out.println(s *s );
    }
    public void circleArea(double r){
        System.out.println(3.14 * r *r);
    }
}
class FindArea extends T36_ClacArea{
    void work(double b, double h, double l, double s, double r){
        triangleArea( b, h);
        rectangleArea( l ,  b);
        squareArea( s);
        circleArea( r);
    }
}
class Area{
    public static void main(String[] args) {
        double a =Double.parseDouble(args[0]);
        double b =Double.parseDouble(args[1]);
        FindArea obj = new FindArea();
        obj.work(a,b,a,a,b);
    }
}