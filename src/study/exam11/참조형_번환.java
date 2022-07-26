package study.exam11;


class Data3{int x;}
public class 참조형_번환 {
    public static void main(String[] args) {



        Data3 d=new Data3();
        d.x=10;


        Data3 d3=copy(d);
        System.out.println("d.x="+d.x);
        System.out.println("d2.x="+d3.x);
    }


    static Data3 copy(Data3 d){
        Data3 temp=new Data3();
        temp.x=d.x;
        return temp;
    }
}
