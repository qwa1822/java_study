package study.chapter06;

import java.util.Arrays;

public class max {
    public static int arr(int[]n){


        if(n==null || n.length==0){
            return -999999;
        }
        int temp=n[0];
        for(int i=0; i<n.length; i++){
            if(temp<n[i])
                temp=n[i];
        }

        return temp;
    }
    public static void main(String[] args) {


        int[] data={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값"+arr(data));
        System.out.println("최대값"+arr(null));
        System.out.println("최대값"+arr(new int[]{}));
    }
}
