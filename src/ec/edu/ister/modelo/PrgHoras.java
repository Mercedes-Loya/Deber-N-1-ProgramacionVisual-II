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
public class PrgHoras {
    public static void main(String[] args) {
    int segTransMier;
    int segFaltanMier, segFaltanJue, segFaltanVie, segFaltanTotal;
    int horas, minutos, segundos;
    
       
        segTransMier=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LOS SEGUNDOS TRANSCURRIDOS DEL DIA MIERCOLES"));  
    
       
        segFaltanMier= 24*3600 - segTransMier;
        segFaltanJue= 24*3600;
        segFaltanVie= 12*3600;
        segFaltanTotal= segFaltanMier + segFaltanJue + segFaltanVie;
        
   
       
           horas= segFaltanTotal /3600;
           minutos= segFaltanTotal %3600 /60;
           segundos= segFaltanTotal %3600 %60;
       
      
           JOptionPane.showMessageDialog(null, "\n Faltan:" + horas + "horas" + minutos +
                   "minutos y" + segundos + "segundos" );
           JOptionPane.showMessageDialog(null, " Para llegar al medio dia del viernes proximo");
          
    
}
}
