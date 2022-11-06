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
public class Ejercicio52 {

    
    public static void main(String[] args) {
    	
    	//Comprueba si las listas son iguales
    	
        boolean ver = true;
        int [] lista = new int[]{1,2,3,45,6,7};
        int [] lista1 = new int[]{1,2,3,4,6,7};
            for (int i = 0;i<lista.length;i++){
                if (lista[i]!=lista1[i]){
                    ver = false;
                }
            }
                if (ver==true){
                    System.out.println("Las listas Son iguales");
                }else{
                    System.out.println("Las listas Son Diferentes");
                }
    }
    
}
