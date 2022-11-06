/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbucle;


public class Ejercicio57 {

   
    public static void main(String[] args) {
    	//ordenar Array metodo burbujaa
    	
        int [] lista = new int[]{50,26,7,9,15,27};
        int menor = 0;
        int pos = 0;
        int tmp = 0;
        boolean ver = false;
        
        
            for(int i = 0;i<lista.length;i++){
                menor = lista[i];
                    for(int x = i + 1;x<lista.length;x++){
                        if (lista[x]<menor){
                            menor = lista[x];
                            pos = x;
                            ver = true;
                        }
                    }
                if (ver==true){
                    tmp = lista[i];
                    lista[i] = lista[pos];
                    lista[pos] = tmp;
                    ver = false;
                }
            }
            System.out.println(lista[0]+" "+lista[1]+" "+lista[2]+" "+lista[3]+" "+lista[4]+" "+lista[5]);
    }
    
}
