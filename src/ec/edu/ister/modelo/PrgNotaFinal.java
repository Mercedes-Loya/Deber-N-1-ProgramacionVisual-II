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
public class PrgNotaFinal {
    public static void main(String[] args) {
        double n1, n2, n3, n4, nf;
        
        n1 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA NOTA 1 DEL ALUMNO:"));
        n2 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA NOTA 2 DEL ALUMNO:"));
        n3 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA NOTA 3 DEL ALUMNO:"));
        n4 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA NOTA 4 DEL ALUMNO:"));
        
        nf= (n1 + n2 + n3 + (n4*2))/5;
        
        JOptionPane.showMessageDialog(null, " El promedio obtenido por el alumno es");
        JOptionPane.showMessageDialog(null, " nf: " +nf);
        
    }
    
}
