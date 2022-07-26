package 상속.ch01;



class Tv {

    boolean power;
    int channel;


    void power() {
        power = !power;
    }

    void channelup() {
        ++channel;
    }


    void channelDown() {
        --channel;
    }

}


    class smartTv extends Tv{
        boolean caption;
        void displayCaption(String text){
            if(caption){
                System.out.println(text);
            }
        }
    }




public class Ex7_1 {
    public static void main(String[] args) {


        smartTv stv=new smartTv();
        stv.channel=10;
        stv.channelup();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption=true;
        stv.displayCaption("Hello, World");



    }
}
