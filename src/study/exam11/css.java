package study.exam11;




public class css {
    public void main(String[] args) {




        Student s=new Student("홍길동",1,1,100,60,76);
        String str=s.info();
        System.out.println(str);
    }

    class Student{


        public String name;
        public int ban;
        public int no;
        public int kor;
        public int eng;
        public int math;


        Student(String name,int ban,int no,int kor,int eng,int math){
            this.name=name;
            this.ban=ban;
            this.no=no;
            this.kor=kor;
            this.eng=eng;
            this.math=math;
        }


        int sum=kor+eng+math;

        public String info(){



            return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+sum/3;

        }
    }

}
