/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.de.ordenamiento;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class MetodoDeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("ORDENAMIENTO DE UNA LISTA DE NÚMEROS: ");
        System.out.println("--------------------------------------------------------");
        System.out.print("INGRESE EL NUMERO TOTAL DE ELEMETOS QUE DESEA INGRESAR: ");

        int numTot = scan.nextInt();
        int listaNum[] = new int[numTot];
        System.out.println("");

        //llenar matriz con datos ingresados por teclado 
        for (int i = 0; i < listaNum.length; i++) {
            System.out.print("[" + (i + 1) + "]: ");
            int num = scan.nextInt();
            listaNum[i] = num;
        }
       
        int t = listaNum.length;
        
        for (int i = 1; i < t; i++) {
            for (int j = t - 1; j >= i; j--) {
                if (listaNum[j] < listaNum[j - 1]) {
                    temp = listaNum[j];
                    listaNum[j] = listaNum[j - 1];
                    listaNum[j - 1] = temp;
                }
            }
        }

        //imprimir la matriz de números ya ordenados 
        System.out.println("lista de nùmeros Ordenados: ");
        for (int i = 0; i < listaNum.length; i++) {
            System.out.print(listaNum[i] + " ");
        }

    }

}
