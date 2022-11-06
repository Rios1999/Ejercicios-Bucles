/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author peluj
 */
public class EjercicioClase {

    /**
     * @param args the command line arguments
     */
    /*Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
    tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
    pantalla (en forma de matriz).*/
    public static void main(String[] args) {
        int tabla[][] = new int[11][11];
            for (int i = 1;i<tabla.length;i++){
                for (int x = 0;x<tabla[i].length;x++){
                    tabla[i][x] = i * x;
                    if (tabla[i][x]<10){
                        System.out.print(0+""+tabla[i][x]+" ");
                    }else{
                        System.out.print(tabla[i][x]+" ");
                    }   
                }
            System.out.println("");
            }
    }
    
}
