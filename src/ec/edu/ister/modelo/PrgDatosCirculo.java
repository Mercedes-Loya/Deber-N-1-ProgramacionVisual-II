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
public class PrgDatosCirculo {
    public static void main(String[] args) {
        final double pi= 3.1416;
        double radio, area, perimetro;
        
        radio =Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL RADIO DE UN CIRCULO:"));
        
        area= pi * radio * radio;
        perimetro= 2 * pi* radio;
        
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
        JOptionPane.showMessageDialog(null, "El perimetro del cierculo es: " + perimetro);
    }
    
}
