package study.ch04;

public class ex4_10 {
    public static void main(String[] args) {

        int sum=0;

        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
