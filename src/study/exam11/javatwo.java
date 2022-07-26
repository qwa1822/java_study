package study.exam11;





public class javatwo {
        public static boolean isNumber(String n){

                if(n==null || n.equals(""))
                        return false;
                for(int i=0; i<n.length(); i++){
                        char ch=n.charAt(i);
                        if(ch<'0' || ch>'9'){
                                return false;
                        }
                        else{
                                return true;
                        }
                }
                return true;
        }

        public static void main(String[] args) {


                String str="123";
                System.out.println(str+"는 숫자입니까?"+isNumber(str));
                str="1234o";
                System.out.println(str+"는 숫자입니까?"+isNumber(str));
        }
        }
