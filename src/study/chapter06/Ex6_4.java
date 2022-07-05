package study.chapter06;

public class Ex6_4 {
    public static void main(String[] args) {

        MyMath n1=new MyMath();

        long result=n1.add(5L,3L);
        long result2=n1.subtract(5L,3L);
        long result3=n1.multiply(5L,3L);
        double reuslt4=n1.divide(5L,3L);


        System.out.println("add(5L,3L)= "+result);
        System.out.println("substract(5L,3L)="+result2);
        System.out.println("multiply(5L,3L)="+result3);
        System.out.println("divide(5L,3L)="+ reuslt4);


    }
}



class MyMath{
    long add(long a,long b){
        long result=a+b;
        return result;


        //return a+b;
    }


    long subtract(long a,long b){
        return a-b;
    }
    long multiply(long a,long b){
        return a*b;
    }

    double divide(double a, double b)
    {
        return a/b;
    }


}
