package study.exam11;

public class arr2 {


    public static int max(int n[]){


        final int min=-999999;
        int max=n[0];


        if(n.length==0 || n==null){
            return -999999;
        }
        for(int i=1; i<n.length; i++){

            if(n[i]>max){
            max=n[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {



        int[] data={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값"+max(null));

    }
}
