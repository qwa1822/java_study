package study.ch04;

public class ch4_20 {
    public static void main(String[] args) {

        int sum=0;
        int i=0;


        while(true){   //무한 반복문 for(;true;) {}
            if(sum>100)
                break;
            ++i;
            sum+=i;
        }  // end of while

        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}
