 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex005.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author rodrigomscruz
 */
public class EX005TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = ler.nextFloat();
        System.out.printf("A nota de %s é %.1f. \n", nome, nota);
        //System.out.format("A nota de %s é %.1f. \n", nome, nota);
    }
    
}
