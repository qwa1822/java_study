package study.exam11;

public class Two_array {

    public static void main(String[] args) {

        int[][]socre={
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };


        int korTotal=0, engTotal=0, mathTotal=0;


        System.out.println("번호 국어   영어  수학  총점  평균 ");
        System.out.println("===============================");



        for(int i=0; i<socre.length; i++){
            int sum=0;
            float avg=0.0f;


            korTotal+=socre[i][0];
            engTotal+=socre[i][1];
            mathTotal+=socre[i][2];

            System.out.printf("%3d",i+1);

            for(int j = 0; j<socre[i].length; j++){
                sum+=socre[i][j];

                System.out.printf("%5d ",socre[i][j]);
            }

            avg=sum/(float)socre[i].length;
            System.out.printf("%5d %5.1f\n",sum,avg);
        }
        System.out.println("======================");
        System.out.printf("총점:%3d %4d%d\n",korTotal,engTotal,mathTotal);
    }
}
