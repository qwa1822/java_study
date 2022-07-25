package exam;

public class main3333 {
    public static void main(String[] args) {


        SutdaDeck22 n1=new SutdaDeck22();


        for(int i=0; i<n1.cards.length; i++){
            System.out.print(n1.cards[i]+",");
        }
    }
}


class SutdaDeck22{
    final int CAR_NUM=20;
    SutdaCard2[]cards=new SutdaCard2[CAR_NUM];


    SutdaDeck22(){

        for(int i=0; i<cards.length; i++){
            if(i==0 || i==2 || i==7){
                cards[i]=new SutdaCard2(i+1,true);
            }
            else{
                cards[i]=new SutdaCard2(i%10+1,false);
            }
        }
    }
}


class SutdaCard2{
    int num;
    boolean isKwang;


    SutdaCard2(){
        this(1,true);
    }

    SutdaCard2(int num,boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }


    public String toString(){
        return num+(isKwang?"K":"");
    }
}