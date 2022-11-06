/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucle;


public class Ejercicio49 {

    public static void main(String[] args) {
    	//Inicializamos una Variable que contiene numeros enteros, los rellenamos aleatoriamente
    	//de 1 ha 100 y finalmente con otro for y dos condicionales determinamos el mayor y el menor
    	
    	
        int [] lista = new int[100];
            for (int i = 0;i<lista.length;i++){
                int gen = (int) Math.floor(Math.random()*(100-1+1)+1);
                lista[i] = gen;
            }
            
            
            int menor = lista[99];
            int mayor = lista[0];
            
            
            for (int x = 0;x<lista.length;x++){
                if (lista[x]>mayor){
                    mayor = lista[x];
                }else if (lista[x]<menor){
                    menor = lista[x];
                }
            }
            
            
        System.out.println("El Mayor es "+mayor+" Y el Menor Es "+menor);
    }
    
}
