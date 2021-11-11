/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

import java.util.Scanner;
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scanner input = new scanner(system.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("masukkan berat :");
        berat = input.nextInt();
        System.out.println("masukkan tinggi :");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("bmi mu adalah"+ bmi);
        
        if(bmi<18.5){
            System.out.println("kurang berat badan");
        }
        else if(bmi<24.9){
            System.out.println("normal");
        }
        else if(bmi<28.9){
            System.out.println("gemuk");
        }
        else {
            System.out.println("obesitas");
        }
    }
    
}
