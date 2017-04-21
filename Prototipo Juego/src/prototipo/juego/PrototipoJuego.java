/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.juego;

import java.awt.Color;

/**
 *
 * @author LuisCarlos
 */
public class PrototipoJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ventana window= new ventana();
        window.setBackground(Color.RED);
        window.setTitle("TablaGame");
        window.setVisible(true);
        window.setResizable(false);
       
    }
    
}
