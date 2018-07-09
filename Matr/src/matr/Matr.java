/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matr;

/**
 *
 * @author ulacit
 */
public class Matr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[][] matriz= {
           {1,2,3,4,5},
           {6,7,8,9,10},
           {10,11,12,13,14},
           {15,16,17,18,19},
           {20,21,22,23,24},};
           
        int nDiagonal = 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
        
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i ==j) {
                    if (!hasAssignedNDiagonal){
                        hasAssignedNDiagonal = true;
                        nDiagonal = matriz [i][j];
                    }else if (nDiagonal != matriz[i][j]){
                        diagonalOk = false;
                    }
                    
                }
            }
        }
        System.out.println("diagonal :" + (diagonalOk? "igual": "diferente")); 
    }
    
}