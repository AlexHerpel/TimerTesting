/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimerTesting;

import java.util.Timer;
import java.util.TimerTask;

    
/**
 *
 * @author Herpel
 */
public class TimerTesting {
    
    Timer myTimer;
    
    public TimerTesting(){
        myTimer = new Timer();
    }
            
    
    public void startMyTimer(){
        myTimer.schedule(new TimerTask(){

            @Override
            public void run() {
                System.out.println("Timer tick... tock...");
            }
        }, 0, 1000);
    }

    void stopTimer() {
        myTimer.cancel();
    }
    
    
}
