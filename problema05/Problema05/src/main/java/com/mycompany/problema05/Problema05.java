/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema05;
import java.util.Scanner;
/**
 *
 * @author Usuario Win11
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor mensual de netflix");
        double netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de youtube premium");
        double youtube = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de dropbox");
        double dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de spotify");
        double spotify = entrada.nextDouble();
        
        double valorTotal = netflix * 0.77 + youtube * 0.77 + dropbox * 
                0.55 + spotify;
        System.out.printf("El valor total a pagar es:"
                + "%.2f\n",
                valorTotal);
    }
}
