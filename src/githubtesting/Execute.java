/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubtesting;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Herpel
 */
public class Execute {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Timer testing!");
        
        TimerTesting myTimer = new TimerTesting();
        myTimer.startMyTimer();
        
        try {
            int i = System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        myTimer.stopTimer();
    }

    
    
}
