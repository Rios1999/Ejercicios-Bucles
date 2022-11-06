
package ejerciciosbucle;


public class Ejercicio50A {

    
    public static void main(String[] args) {
    	
    	//Definimos una lista de numeros enteros, con valores aleatorios,
    	//despues sacamos por pantalla los multiplos de 5 con un condicional
    	
        int [] lista = new int[100];
            for (int i = 0;i<lista.length;i++){
                int gen = (int) Math.floor(Math.random()*(100-1+1)+1);
                lista[i] = gen;
            }
            for (int x = 0;x<lista.length;x++){
                if(lista[x]%5==0){
                    System.out.print(lista[x]+", ");
                }
            }
    }
    
}
