/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema03;

import java.util.Scanner;

/**
 *
 * @author Usuario Win11
 */
public class Problema03 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        String nombreCompleto;
        String direccion;
        String nombreTercerHijo;
        double costoMinuto;
        int minutosConsumidos;
        double valorCancelar;
        
        
        System.out.println("Ingrese el nombre completo del dueño de la linea");
        nombreCompleto = entrada.nextLine();
        System.out.println("Ingrese el costo por minuto");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese la direccion del domicilio");
        entrada.nextLine();
        direccion = entrada.nextLine();
        System.out.println("Ingrese el costo por minuto");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos");
        minutosConsumidos = entrada.nextInt();
           
        valorCancelar = (costoMinuto * minutosConsumidos);
        
        System.out.printf("Nombres completos:%s\n\tDireccion:%s\nCosto por "
                + "minuto:"
                + "%.2f\n\tNumero de minutos consumidos:%s\n\t\tValor a cancelar:"
                + "%s/b",
                nombreCompleto,
                direccion,
                costoMinuto,
                minutosConsumidos,
                valorCancelar);
    }
}
