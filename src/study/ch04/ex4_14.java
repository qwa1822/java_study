package study.ch04;

public class ex4_14 {
    public static void main(String[] args) {
        int sum=0;

        //num = 12345, 1234, 123, 12, 1
        for(int num=12345; num>0; num=num/10){
            System.out.println(num%10);
            sum+=num%10;
        }
        System.out.println("각 자릿수의 합"+sum);



    }
}
