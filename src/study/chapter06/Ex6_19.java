package study.chapter06;


class MyTv{
   public  boolean isPoweron;
    int channel;
    int volume;


    final int Max_Volume=100;
    final int MIN_VOlume=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;



    void tunrOnOff(){
        isPoweron=!isPoweron;
    }

    void volumeUp(){
        if(volume<MIN_VOlume)
            volume++;
    }

    void volumeDown(){
        if(volume>MIN_VOlume)
            volume--;
    }

    void channelUp(){
        channel++;
        if(channel>100){
            channel=MIN_CHANNEL;
        }
    }

    void channelDOwn(){
        channel--;
        if(channel<1)
            channel=MAX_CHANNEL;
    }



}


public class Ex6_19 {

    public static void main(String[] args) {
        MyTv t=new MyTv();
        t.channel=100;
        t.volume=0;

        System.out.println("CH: "+t.channel+", VOL"+t.volume);

        t.channelDOwn();
        t.volumeDown();
        System.out.println("CH: "+t.channel+", VOL:"+t.volume);

        t.volume=100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH: "+t.channel+", VOL:"+t.volume);
    }
}
