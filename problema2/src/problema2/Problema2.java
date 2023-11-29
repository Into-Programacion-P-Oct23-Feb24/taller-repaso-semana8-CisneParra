/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num = 0;
        int contador = 0;
        System.out.println("Ingrese su valor de n");
        num = entrada.nextInt();
        if ((num % 2 == 0) && (num >0 )){
            while (contador <= num){
                contador = contador + 1;
                System.out.printf("%d",contador);
            }
        }else {
            System.out.println("El valor ingresado debe de ser par");
        }

    }

}
