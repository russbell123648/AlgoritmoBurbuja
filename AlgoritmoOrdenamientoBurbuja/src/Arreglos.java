/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carmina Lizbeth Flores Solano
 */
public class Arreglos{

    public static void main(String[] args) {
        AlgoritmoOrdenamientoBurbuja ordenar=new AlgoritmoOrdenamientoBurbuja();
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10};
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Ordenado con burbuja1");
        ordenar.burbuja(vector1);
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo Ordenado con burbuja2");
        ordenar.burbuja(vector2);
        ordenar.mostrarArreglo(vector2);
    }


}

