/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosbucle;
import java.util.Scanner;

public class Ejercicio48 {

    
    public static void main(String[] args) {
    	//Nos dan un ejercicio en el que tenemos un array con numeros inicializados
    	//creamos otra lista tivis y copiamos todo lo que tenemos en la primera 
    	//lista en esta una vez hecho se sustituye los valores negativos por 8
    	
        int [] flags = new int[]{0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int [] tivic = new int[flags.length];
        
        
            for (int i = 0;i<flags.length;i++){
                tivic [i] = flags [i];
            }
            for (int x = 0;x<flags.length;x++){
                if (flags[x]<0){
                    flags[x] = 8;
                }
            }
              
        System.out.println(flags[10]+" "+tivic[1]);
    }

}
