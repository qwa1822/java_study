package ch06.two;

public class six_7 {
    public static int[] shffle(int[]n){
        for(int i=0; i<n.length; i++){

            int j=(int)(Math.random()*n.length);
            int temp=n[i];
            n[i]=n[j];
            n[j]=temp;
        }

        return n;
    }
    public static void main(String[] args) {

        int[] origina={1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(origina));

        int[] result=shffle(origina);
        System.out.println(java.util.Arrays.toString(result));
    }
}
