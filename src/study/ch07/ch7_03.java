package study.ch07;

class MyPoint{
    int x;
    int y;

}
class Circle extends MyPoint {
    int r;
}

class Circle2{
    MyPoint p=new MyPoint();
    int r;
}


public class ch7_03 {
    public static void main(String[] args) {

        Circle2 c=new Circle2();
        c.p.x=1;
        c.p.y=2;
        c.r=3;

        System.out.println("c.x="+c.p.x);
        System.out.println("c.y="+ c.p.y);
        System.out.println("c.r="+c.r);
    }
}
