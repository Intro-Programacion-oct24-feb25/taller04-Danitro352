/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema01;
import java.util.Scanner;
/**
 *
 * @author Usuario Win11
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Ingrese la base del triangulo");
        altura = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        base = entrada.nextDouble();
        
        area = ((altura * base)/ 2);
       
        System.out.printf("La altura del triangulo es: \n" + area);
  }
}