package ch06.two;

public class ch7 {
    public static void main(String[] args) {



        Student s=new Student("홍길동",1,1,100,60,76);
        String str=s.info();
        System.out.println(str);
    }
}

class Student{
    String name;
    public int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student(String name,int ban,int no,int kor,int eng,int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    int sum=kor+eng+math;
    float average=0.0f;

    public String info(){
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+(kor+eng+math)+","+average();
    }


    public float average(){
        return sum/3;
    }
}

