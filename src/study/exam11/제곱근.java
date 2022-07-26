package study.exam11;

public class 제곱근 {

    static double getDisatnace(int x,int y,int x1,int y1){


        double ss=Math.sqrt((x-x1)*(y-y1)+(x-x1)*(y-y1));

        return ss;

    }

    public static void main(String[] args) {

        System.out.println(getDisatnace(1,1,2,2));
    }

}
