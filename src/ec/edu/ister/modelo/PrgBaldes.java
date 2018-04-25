/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author MARIA LOYA
 */
public class PrgBaldes {
    public static void main(String[] args) {
        int baldesA, baldesB, baldesC;
        int tiempoA, tiempoB, tiempoC, tiempoTotal;
        int horas, minutos, segundos;
        baldesA =Integer.parseInt(JOptionPane.showInputDialog("INGRESE CANTIDAD DE BALDES TIPO \"A\" A PRODUCIR:"));
        baldesB =Integer.parseInt(JOptionPane.showInputDialog("INGRESE CANTIDAD DE BALDES TIPO \"B\" A PRODUCIR:"));
        baldesC =Integer.parseInt(JOptionPane.showInputDialog("INGRESE CANTIDAD DE BALDES TIPO \"C\" A PRODUCIR:"));
        
        
        tiempoA= baldesA *15;
        tiempoB= baldesB *15;
        tiempoC= baldesC *62;
        
        tiempoTotal= tiempoA + tiempoB + tiempoC;
        
        horas= tiempoTotal/ 3600;
        minutos= tiempoTotal % 3600 /60;
        segundos = tiempoTotal %3600 %60;
        
        
        
        
       
        JOptionPane.showMessageDialog(null, " Cantidad de horas \t: " + horas);
        JOptionPane.showMessageDialog(null, "\n Cantidad de minutos \t: " + minutos);
        JOptionPane.showMessageDialog(null, " \n Cantidad de segundos  \t: " + segundos);
    }
    
}
