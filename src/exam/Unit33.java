package exam;

public class Unit33 {
    public static void main(String[] args) {
        Unit2[] n2={new Marine22(),new Tank3(),new Dropship3()};

        for(int i=0; i<n2.length; i++){
            n2[i].move(100,200);
        }
    }
}

abstract class Unit2{
    int x,y;

    abstract void move(int x,int y);
    void stop(){

    }
}

class Marine22 extends Unit2{
    void move(int x,int y){
        System.out.println("Marine[x="+x+","+y+"]");
    }
    void Stimpack(){

    }
}

class Tank3 extends Unit2{
    void move(int x,int y){
        System.out.println("Tank[x="+x+","+y+"]");
    }

    void changeMode(){

    }
}


class Dropship3 extends Unit2{
    void move(int x,int y){
        System.out.println("Dropship[x="+x+",y="+y+"]");
    }

    void load(){

    }
    void unload(){

    }
}

