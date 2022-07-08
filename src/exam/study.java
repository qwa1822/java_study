package exam;


class Product{
    int price;
    int bonusPoint;


    Product(int price){
        this.price=price;
        bonusPoint=(int)(price/10.0);
    }
}

class Tv1 extends Product{
    Tv1(){
        super(100);
    }


    public String toString(){
        return "TV";
    }
}

class Computer extends  Product{
    Computer(){
        super(3000);
    }

    public String toString(){
        return "Computer";
    }
}


class buy{
    int money=10000;
    int bonusPoint=0;


    void Buyer(Product d){

        if(d.price>money){
            System.out.println("현재 남은돈이 없습니다");
            return;
        }

        money-=d.price;
        bonusPoint+=d.bonusPoint;
        System.out.println(d+"를 구입하셨습니다.");

        
        
    }
}


public class study {
    public static void main(String[] args) {


        buy b=new buy();
        b.Buyer(new Computer());
        b.Buyer(new Tv1());


        System.out.println("현재 남은돈은"+b.money+"만원입니다");
        System.out.println("현재 보너스점수는"+b.bonusPoint+"입니다.");

    }
}
