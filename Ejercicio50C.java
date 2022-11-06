/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucle;

/**
 *
 * @author peluj
 */
public class Ejercicio50C {

    
    public static void main(String[] args) {
    	
    		//Te inicializa una lista de numeros enteros con valores aleatorios
    		//luego determinamos numero mayor y su posicion
    	
        	int [] lista = new int[100];
        	//definimos la variable mayor, suponiendo que el mayor es lista[0]
            int mayor = lista[0];
            int pos = 0;
            for (int x = 0;x<lista.length;x++){
                int gen = (int) Math.floor(Math.random()*(100-1+1)+1);
                lista[x] = gen;
                if (lista[x]>mayor){
                    mayor = lista[x];
                    pos = x;
                }
            }
            System.out.println("El mayor de la lista es "+mayor+" y esta en la posición "+pos);
            
    }
    
}
