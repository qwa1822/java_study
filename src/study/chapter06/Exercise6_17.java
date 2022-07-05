package study.chapter06;

public class Exercise6_17 {

    static  int[] shuffle(int []n){

        for(int i=0; i<n.length; i++){
            int j=(int)(Math.random()*n.length);
            int temp=n[i];
            n[i]=n[j];
            n[j]=temp;
        }
        return n;
    }


    public static void main(String[] args) {

        int[] original={1,2,3,4,5,6,7,8,9};

        System.out.println(java.util.Arrays.toString(original));

        int[] result=shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
