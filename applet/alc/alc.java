//<applet code = "alc" height = 500 width = 600></applet>

import java.applet.*;
public class alc extends Applet{
    public void init(){
        System.out.println("Init");
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}