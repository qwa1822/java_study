package study.exam11;


class MyTv{
    boolean isPoweron;
    int channnel;
    int volume;


    final int MAX_VOLUME=100;
    final int MIN_VOLUME=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;


    void turnonoff(){

        if(isPoweron==true){
            isPoweron=false;
        }
        else{
            isPoweron=true;
        }
    }

    void volumeUp(){
        if(volume<MAX_VOLUME){
            volume++;
        }
    }
    void volumeDown(){
        if(volume>MIN_VOLUME){
            volume--;
        }
    }

    void channelUp(){
        channnel++;
        if(channnel==MAX_CHANNEL){
            channnel=MIN_CHANNEL;
        }

    }

    void channelDown(){
        channnel--;
        if(channnel==MIN_CHANNEL){
            channnel=MAX_CHANNEL;
        }
    }
}



public class Ex {
    public static void main(String[] args) {

        MyTv t=new MyTv();
        t.channnel=100;
        t.volume=0;
        System.out.println("CH:"+t.channnel+",VoL"+t.volume);

        t.channelDown();
        t.volumeDown();


        System.out.println("CH:"+t.channnel+",VOL:"+t.volume);

        t.volume=100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channnel+",VOL"+t.volume);

    }
}
