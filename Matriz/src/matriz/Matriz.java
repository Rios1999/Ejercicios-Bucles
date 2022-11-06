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
public class Matriz {

    /**
     * @param args the command line arguments
     */
    /*1 Crea una matriz 5x5,
        Inizializa con valors aleatorios entre 1 y 50
        Mostrar la matriz con cada fila en una linea*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un Numero de fila y Columnas");
        if (scan.hasNextInt()){
            int Num1 = scan.nextInt();int Num2 = scan.nextInt();
            int tabla [][] = new int[Num1][Num2];
            for (int i = 0;i<tabla.length;i++){
                for (int j = 0;j<tabla[i].length;j++){
                    int gen = (int) Math.floor(Math.random()*(50-1+1)+1);
                    tabla[i][j] = gen;
                    if (tabla[i][j]%2==0){
                        tabla[i][j] = 0;
                    }
                    if (tabla[i][j] == 1){
                        tabla[i][j] = 0;
                    }
                    if (tabla[i][j]<10){
                        System.out.print(0+""+tabla[i][j]+" ");
                    }else{
                        System.out.print(tabla[i][j]+" ");
                    }       
                }  
            System.out.println("");
            }
            
        }else{
            System.out.println("Deber ser un Numero Entero");
        }
    }
    
}
