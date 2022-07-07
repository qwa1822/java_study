package study.chapter06;







    public class ex0151 {

        public static boolean isNumber(String s){



            if(s==null || s.equals(""))
                return false;
            for(int i=0; i<s.length(); i++){
                char gg=s.charAt(i);

                if(gg<'0' || gg>'9'){
                    return false;
                }

            }

            return true;




        }

        public static void main(String[] args) {


            String str="123";
            System.out.println(str+"는 숫자입니까?");

            str="1234o";
            System.out.println(str+"는 숫자입니까?"+isNumber(str));



    }

}