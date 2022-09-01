/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopotencia;

import javax.swing.JOptionPane;

public class EjercicioPotencia {

    public static void main(String[] args) 
    {
        potencia();
    }
    public static void potencia(){
        double a,b,c;
        for (int i=0; i<3;i++){
        a=Double.parseDouble(JOptionPane.showInputDialog("Digite la base"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Digite el exponente"));
        c=Math.pow(a, b);
        System.out.println(c);
        if (c>100){
            System.out.println("Es mayor a 100");
        }else System.out.println("Es menor a 100");
        }
    }
}
