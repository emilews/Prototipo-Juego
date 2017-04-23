/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.juego;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Data {

    String respuestaStr = " ";
    Integer respuestaInt;
   

    //Metodo para validar si es entero
    boolean validarInt(String respuesta) {
        boolean EsValido = false;
        Integer num;

        try {
            num = Integer.parseInt(respuesta);
            EsValido = true;

        } catch (Exception e) {

        }

        return EsValido;
    }

    public String capturaDatos() {

        respuestaStr = ventana.Entrada.getText();
        return respuestaStr;

    }

  

    public int numeroAleatorio() {
        int random = 0;
        boolean bandera = true;
        while (bandera) {
            random = (int) (Math.random() * 13);
            if (random != 0) {
                bandera = false;
            }
        }

        return random;
    }

    public int numeroAleatorioFacil() {
        int random = 0;
        boolean bandera = true;
        while (bandera) {
            random = numeroAleatorio();
            if (random < 4) {
                bandera = false;
            }

        }

        return random;
    }

       public int numeroAleatorioMedio() {
        int random = 0;
        boolean bandera = true;
        while (bandera) {
            random = numeroAleatorio();
            if (random >= 4 && random <=7 ) {
                bandera = false;
            }

        }

        return random;
    }
       
        public int numeroAleatorioDificil() {
        int random = 0;
        boolean bandera = true;
        while (bandera) {
            random = numeroAleatorio();
            if (random >= 7 && random <= 12 ) {
                bandera = false;
            }

        }

        return random;
    }  
       
    public String Operacion(int num1, int num2) {
        String operacion;

        operacion = num1 + " " + "x" + " " + num2;
        return operacion;
    }
    
    public int resultado(int num1, int num2){
    int resultado;
    resultado=num1*num2;
    return resultado;
    }
    public Data() {

    }

}
