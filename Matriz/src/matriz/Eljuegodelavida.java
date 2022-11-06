/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author peluj
 */
public class Eljuegodelavida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla [][] = new int[4][4];
        int tabla1 [][] = new int [4][4];
        int pos1 = 0;int pos2 =0;int cont = 0;
        for (int i =0;i<tabla.length;i++){
            for (int x=0;x<tabla[i].length;x++){
                int gen = (int) Math.floor(Math.random()*(2-0)+0);
                tabla[i][x] = gen;
                System.out.print(tabla[i][x]+" ");
            }
         System.out.println("");
        }
        while(true){
            for (int i = 0;i<tabla.length;i++){
                for (int x = 0;x<tabla[i].length;x++){
                    if (tabla[i][x]==1){
                        if (i == 0 && x == 0){
                            for (int y = i+1;y<=1;y++){
                                for (int e = x+1;e<=1;e++){
                                    if (tabla[1][e]==0){
                                        cont++;
                                    }else if (tabla[0][e]==0){
                                        cont++;
                                    }
                                    
                                }
                            }
                        }else if (i == 4 && x == 4){
                             for (int y = i+1;y<=1;y++){
                                for (int e = x+1;e<=1;e++){
                                    if (tabla[1][e]==0){
                                        cont++;
                                    }else if (tabla[0][e]==0){
                                        cont++;
                                    }
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
