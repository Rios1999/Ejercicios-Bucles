/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucle;
import java.util.Scanner;

public class Ejercicio54 {

    
    public static void main(String[] args) {
    	//Buscador de un valor dentro de un Array
    	
        Scanner scan = new Scanner(System.in);
        boolean ver = false;
        int [] lista = new int[]{1,5,67,9,8,6};
        System.out.println("Introduce un Numero: ");
        int Num = scan.nextInt();
            for (int i = 0;i<lista.length;i++){
                if (lista[i]==Num){
                    ver = true;
                }
            }
                if (ver==true){
                    System.out.println("Esta en la lista el Numero Indicado");
                }else{
                    System.out.println("No esta En la lista el Numero Indicado");
                }
    }
    
}
