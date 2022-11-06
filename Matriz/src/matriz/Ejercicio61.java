/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;
import java.util.Scanner;
/**
 *
 * @author peluj
 */
public class Ejercicio61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int Num1 = 0;int Num2 = 0;int mayor= 0;int menor = 0;int igual = 0;
       System.out.println("Introduce un Numero de filas y Columnas");
       if (scan.hasNextInt()){
           Num1 = scan.nextInt();Num2 = scan.nextInt();
           int tabla [][] = new int[Num1][Num2];
                for (int i = 0;i<tabla.length;i++){
                    for (int x = 0;x<tabla[i].length;x++){
                        int gen = (int) Math.floor(Math.random()*(5-(-5))+(-5));
                        tabla[i][x] = gen;
                        if (tabla[i][x]>0){
                           mayor++;
                        }else{
                           menor++;
                        }
                        if (tabla[i][x]==0){
                            igual++;
                        }
                    }
                }
       }else{
           System.out.println("Debe ser un Numero Entero");
       }
       System.out.println("Mayores de 0 son: "+mayor+" Menores de 0 son: "+menor+" Iguales de 0 son: "+igual);
    }
    
}
