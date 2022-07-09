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
            super(200);
        }

        public String toString() {
            return "Computer";
        }
    }

    class Tv1 extends Product351 {
        Tv1() {
            super(100);
        }

        public String toString() {
            return "TV";
        }


    }

    class Audio extends Product351{
        Audio(){
            super(50);
        }

        public String toString() {
        return "audio";
        }
    }

}


    class Buyer333{
        int price=1000;
        int bonuspoint=0;
        Product cc[]=new Product[20];
        int i=0;

       void Buyer333(Product d){
           if(price<d.price){
               System.out.println("돈이 없어요...");
               return;
           }
            price-=d.price;
            bonuspoint+=d.bonusPoint;

            cc[i++]=d;
           System.out.println(d+"를 구입하셨습니다.");
        }

        void summary(){
           int sum=0;
           String itemList="";

           for(int i=0; i<cc.length; i++){
               if(cc[i]==null) break;
               sum+=cc[i].price;
               itemList=cc[i]+",";
           }


            System.out.println("구입하신 물품의 총금액은"+ sum+"만원입니다");
            System.out.println("구입하신 제품은"+itemList+"입니다.");
        }
    }







public class 매개변수 {

    public static void main(String[] args) {

        Buyer333 b=new Buyer333();
        b.Buyer333(new Tv1());
        b.Buyer333(new Computer());
        b.Buyer333(new Audio2());

        b.summary();


    }

}
