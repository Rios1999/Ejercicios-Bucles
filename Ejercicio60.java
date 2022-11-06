/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbucle;

/**
 *
 * @author peluj
 */
public class Ejercicio60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	
    	//Tabla de multiplicación
    	
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
