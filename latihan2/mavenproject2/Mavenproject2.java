/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author RIDA
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Berikan formula dan pemecahan akar dari persamaan kuadrat ax2 + bx + c = 0");
        Scanner masuk = new Scanner (System.in);
        System.out.print ("Masukan nilai a: ");
        double a = masuk.nextDouble();
        if (a==0){
            System.out.println("Ini bukan persamaan kuadrat.");
        }else {
            System.out.print("Masukan nilai b: ");
            Double b = masuk.nextDouble();
            System.out.print("Masukan nilai c: "); 
            Double c = masuk.nextDouble();
            Double D = Math.pow( b, 2) - (4 * a * c);
            if (D < 0) {
                System.out.println("Akarnya tidak nyata. ");
                 } else if (D > 0) {
                System.out.println("Akarnya nyata dan berbeda. ");
                 } else if (D == 0) {
                System.out.println("Akarnya nyata dan setara. ");
                 }
                double eq1 =(-b) / (2 * a);
                double eq2 =(Math.sqrt(D)) / (2 * a);
                double x1 = eq1 - eq2;
                double x2 = eq1 + eq2;
                 System.out.println("Nilai X nya adalah " + x1 + "," + x2 + ".");
                 
            }
        }
        
    }


