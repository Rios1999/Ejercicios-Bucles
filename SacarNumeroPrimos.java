
package ejerciciosjaime;


import java.util.Scanner;

public class SacarNumeroPrimos {

    static public boolean comprobarPrimos(int valor) {
        
       boolean com = true;
       
       //Es un for restando, introduzco un valor al for
       //desde ese valor va ha ir decreciendo hasta llegar a 1
       //si entre esos numeros sale divisor de 0 un numero que
       //se puede divir por otro numero que no sea por el mismo o 
       //por unooo
       
        for (int i = valor - 1; i > 1; i--) {
            if (valor % i == 0) {
                com = false;
            }
        }
        
        return com;
    }
    
   
    public static void main(String[] args) {
        
        //Variables para el ejercicio
        
        Scanner scan = new Scanner(System.in);
        boolean com = true;
        int num = scan.nextInt();
        double calculo;
        System.out.println("Esto son los numeros primos ");

        
        //Segunda solucion un for con otro for anidado
        //mi planteamiento ha sido que con el primer for establezco un rango
        //con el segundo voy comparando y si hay algun numero que el resto sea 0
        //ademas que no sea una división por si mismo y que sea diferente a 1
        
        for(int i = 1;i<=num;i++){
            
            
            for(int x = 1;x<=num;x++){

                if(i%x==0 && x!=i && x!=1){
                    com = false;
                }
            }
            
            if(com){
                System.out.println(i+" ");
            }else{
                com = true;
            }    
        }
        
        /*
        //Forma utilizando el metodo static de arriba
        mi planteamiento en este caso es que si el metodo
        compribarPrimos devuelve true quiere decir que en el metodo
        el numero solo se ha podido dividir por el mismo o por uno.
        
        for(int i = 1;i<=num;i++){
            if(comprobarPrimos(i)){
                System.out.println(i+" ");
            }
        }
*/
    }

}
