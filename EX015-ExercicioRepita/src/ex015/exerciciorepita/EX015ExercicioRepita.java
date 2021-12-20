/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex015.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigomscruz
 */
public class EX015ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, cont, s, pares, impares, maiores100;
        float media;
        cont = s = pares = impares = maiores100 = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: (Valor 0 interrompe)"));
            cont++;
            s = s + n;
            if(n %2 == 0){
                pares++;
            }
            else{
                impares++;
            }
            if(n>100){
                maiores100++;
            }
        } while(n != 0);
        media = (float) s/cont;
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Total de " + cont + "<br>Somatório vale " + s + "<br>Total de Pares é " + pares + "<br>Total de Ímpares é " + impares + "<br>Total maiores que 100 são " + maiores100 + "</html>");
        
    }
    
}
