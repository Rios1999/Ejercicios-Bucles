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
public class EjercicioClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabla [][] = new int[5][5];
        System.out.println("Introduce un Numero del 1 al 100");
        int Num1 = scan.nextInt();
            for (int i = 0;i<tabla.length;i++){
                for (int x = 0;x<tabla[i].length;x++){
                    int gen = (int) Math.floor(Math.random()*(100-1)+1);
                    tabla[i][x] = gen;
                        if (Num1 == tabla[i][x]){
                            System.out.println("El numero Introducido esta en la matriz");
                            x = tabla[x].length;
                        }
                }
            }
            
        
    }
    
}
