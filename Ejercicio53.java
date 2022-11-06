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
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posicion = 4;
        int [] lista = new int[]{2,4,6,8,1,3,5,7};
        int []  lista1 = new int[lista.length+2];
        
        //Creamos una 2 lista de numeros enteros 
        //en la segunda lista tenemos que meter en la posicion 4 y 7
        //200 y 300 
        //mediante el intercambio de variable conseguimos eso
        
        
        int tmp1;
        int cont = 0;
        
            for(int i = 0;i<lista1.length;i++){
            	
            	lista1[i] = lista[cont];
            	
                if (i == 3){
                	tmp1 = lista1[i];
                	lista1[i] = 200;
                	lista1[i+1] = tmp1;
                	i++;
                	
                }else if(i==6) {
                	tmp1 = lista1[i];
                	lista1[i] = 300;
                	lista1[i+1] = tmp1;
                	
                	i++;
                }
                
                cont++;
                   
            }
            
               System.out.print(lista1[6]+" ");  
            }
            
    
}
