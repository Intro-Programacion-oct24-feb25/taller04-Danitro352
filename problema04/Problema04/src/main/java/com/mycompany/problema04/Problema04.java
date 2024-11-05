/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema04;

import java.util.Scanner;

/**
 *
 * @author Usuario Win11
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombreCliente;
        String valoresIniciales = "Valores Iniciales:";
        double costoCPU;
        double costoTeclado;
        double costoRaton;
        double costoPantalla;
        double valorTotal;
        
        
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el valor del CPU");
        costoCPU = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        costoTeclado = entrada.nextDouble();
        System.out.println("Ingrese el valor del raton");
        costoRaton = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla");
        costoPantalla = entrada.nextDouble();
                
        valorTotal = (costoCPU + costoTeclado + costoRaton + costoPantalla);
        
        System.out.printf("Nombres del cliente:%s\n%s\nCPU"
            + "%.2f\nTeclado:%.2f\nRaton:%.2f\nPantalla:%.2f\n\n\n"
            + "Valor a cancelar"
                + "%.2f\n",
                nombreCliente,
                valoresIniciales,
                costoCPU,
                costoTeclado,
                costoRaton,
                costoPantalla,
                valorTotal);
    }
}
