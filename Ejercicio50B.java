/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucle;


public class Ejercicio50B {

    public static void main(String[] args) {
    	//Inicializa una lista de numeros enteros con valores aleatorios
    	//y saca por pantalla aquellos que sean multiplos de 2
    	
        int [] lista = new int[100];
            for (int i = 0;i<lista.length;i++){
                int gen = (int) Math.floor(Math.random()*(100-1+1)+1);
                lista[i] = gen;
            }
            for ( int x = 0;x<lista.length;x++){
                if(lista[x]%2==0){
                    System.out.print(lista[x]+", ");
                }
            }
    }
    
}
