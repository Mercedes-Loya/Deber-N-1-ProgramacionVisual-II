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
public class PrgCatPersonas {
    public static void main(String[] args) {
        int personas;
        double numA, numB, numC, numD;
        double porA, porB, porC, porD;
        
       personas =Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD TOTAL DE PERSONAS:"));
       
       
       numA= personas *0.30;
       numB= numA *0.40;
       numC= (numA + numB)*0.25;
       numD= personas -(numA + numB+ numC);
       
       
       porA= numA/ personas * 100;
       porB= numB/ personas * 100;
       porC= numC/ personas * 100;
       porD= 100-(porA + porB + porC);
       
       
       JOptionPane.showMessageDialog(null, "\n Categorias \t");
       JOptionPane.showMessageDialog(null, "\nA \t\t" + porA +"%");
       JOptionPane.showMessageDialog(null, "\nB \t\t" + porB +"%");
       JOptionPane.showMessageDialog(null, "\nC \t\t" + porC +"%");
       JOptionPane.showMessageDialog(null, "\nD \t\t" + porD +"%");
    }  
}
