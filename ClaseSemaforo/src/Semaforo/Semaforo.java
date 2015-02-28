/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

/**
 *
 * @author Usuario
 */
public class Semaforo {
//Restringir modificacion variable color
    int color = 1;
    boolean parpadeo = false;

    void bajar() {
        
        if (color >= 3) {
            color = 3;
        } else {
            color++;
            if (color != 2) {
                parpadeo = false;
            } else {
                parpadeo = true;
            }
        }
    }

    void subir() {
        
        if (color <= 1) {
            color = 1;
        } else {
            color--;
            if (color != 2) {
                parpadeo = false;
            } else {
                parpadeo = true;
            }
        }
    }
    
    int getColor() {
        return color;
    }
    
    boolean isParpadeando() {
        if (color == 2){
            parpadeo = true;
        } else {
            parpadeo = false;
        }
        return parpadeo;
    }

}
