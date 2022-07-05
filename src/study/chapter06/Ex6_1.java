package study.chapter06;




class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    Student(){}

    Student(String name,int ban,int no,int kor,int eng,int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }

    public String Info(){


        sum=kor+eng+math;


        average=Math.round((sum/3f*10)/10.0);

        return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+average;
    }

    public int total()

    {
        return kor+eng+math;
    }

    public float getAverage(){
        return (float)Math.round((total()/3)*100/100);
    }
}



public class Ex6_1 {
    public static void main(String[] args) {

        Student s=new Student();
        s.name="홍길동";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("이름:"+s.name);
        System.out.println("총점: "+s.total());
        System.out.println("평균: "+s.getAverage());
    }
}
