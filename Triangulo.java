/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author peluj
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int dato = scan.nextInt();
        for (int x = 1;x<dato;x++){
            for (int y = dato;y>x;y--){
                System.out.print(" ");
                
            }
            for (int i = 0;i<x;i++){
                    System.out.print("* ");
            }
        System.out.println("");
        }
    }
}


