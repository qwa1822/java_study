package study.ch07;

class Tv {
    boolean power;  //전원상태(on/off)
    int channel;   //채널


    void power() {
        power = !power;

    }

    void channelUp() {
        ++channel;

    }

    void channelDown() {
        --channel;
    }
}


class SmartTv extends Tv {   //smartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;            //캡션상태(on/off)

    void displayCaption(String text) {
        if (caption) {    //캡션 상태가 on(true)일 때만 text를 보여준다.
            System.out.println(text);
        }
    }
}


public class ex7_1 {
    public static void main(String[] args) {

        SmartTv stv = new SmartTv();
        stv.channel = 10;     //조상 크랠스로부터 상속받은 멤버
        stv.channelUp();        //조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        System.out.println("Hello, World");
        stv.caption = true;         //캡션(자막)기능을켠다.
        stv.displayCaption("Hello, World");
    }
}

