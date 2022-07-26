package study.exam11;

public class exam33 {
    public static void main(String[] args) {


        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
        String str=s.info();

        System.out.println(str);

        Student2 ss=new Student2();
        s.name="홍길동";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;


        System.out.println("이름"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.average());
    }

}



    class Student2{



        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;
        int sum=0;

        public Student2(String name,int ban,int no,int kor,int eng,int math){
            this.name=name;
            this.ban=ban;
            this.no=no;
            this.kor=kor;
            this.eng=eng;
            this.math=math;

        }

        Student2(){};



        public String info(){
            sum=kor+eng+math;
            double average=sum/3;
            return name+","+ban+","+no+","+eng+","+math+","+sum+","+average;
        }


        public int getTotal(){
            sum=kor+math+eng;
            return sum;
        }


        public float average(){
            float average=sum/3;

            return Math.round(average*0.1000);
        }

    }

