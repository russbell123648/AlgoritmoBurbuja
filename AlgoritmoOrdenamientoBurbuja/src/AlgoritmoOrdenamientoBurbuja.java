/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carmina Lizbeth Flores Solano
 */
public class AlgoritmoOrdenamientoBurbuja {
    int i, j, temporal;

    public AlgoritmoOrdenamientoBurbuja() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    public void burbuja(int[] arreglo) {
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;

                }

            }
        }
    }

    public void burbuja2(int[] arreglo) {
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;

                }
            }
        }
    }


    public void mostrarArreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.println("[" + arreglo[k] + "]");

        }
        System.out.println();

    }
}
