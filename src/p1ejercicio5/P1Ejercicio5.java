/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */
public class P1Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, suma=0;
        int[] ar=new int[10];
        for(i=0; i<ar.length; i++){
            ar[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese 10 numeros"));
            suma += ar[i];
        }
        JOptionPane.showMessageDialog(null, "la suma de todos da: " + suma);
        
        for(i=9; i>=0; i--)
            JOptionPane.showMessageDialog(null, ar[i]);
    }
    
}
