package exam;

class Product351 {

    int price;
    int bounsPoint;

    Product351(int price) {
        this.price = price;
        bounsPoint = (int) (price / 10.0);  //10프로
    }


    class Computer extends Product351 {
        Computer() {
            super(3000);
        }

        public String toString() {
            return "Computer";
        }
    }

    class Tv1 extends Product351 {
        Tv1() {
            super(2000);
        }

        public String toString() {
            return "TV";
        }


    }

}


    class Buyer333{
        int price=30000;
        int bonuspoint=0;


       void Buyer333(Product d){
           if(price<d.price){
               System.out.println("돈이 없어요...");
               return;
           }
            price-=d.price;
            bonuspoint+=d.bonusPoint;
           System.out.println(d+"를 구입하셨습니다.");


        }
    }







public class 매개변수 {

    public static void main(String[] args) {

        Buyer333 b=new Buyer333();
        b.Buyer333(new Computer());
        b.Buyer333(new Tv1());

        System.out.println("현재 남은돈은"+b.price+"입니다");
        System.out.println("현재 보너스점수는"+b.bonuspoint+"입니다.");


    }

}
