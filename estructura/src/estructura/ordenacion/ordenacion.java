/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.ordenacion;

import estructura.modelo.alumno;

/**
 *
 * @author mtand
 */
public class ordenacion {
    
    public void imprimeVector(int prmArreglo[]) {
        for (int i = 0; i<prmArreglo.length; i++)
            System.out.printf("[%s]", prmArreglo[i]);
        System.out.println("");
    }
    
    public void imprimeVector(alumno prmArreglo[]) {
        for (int i = 0; i<prmArreglo.length; i++)
            System.out.printf("[%s]", prmArreglo[i]);
        System.out.println("");
    }
    
    public void Burbuja(int prmArreglo[]) {
        int i, j, temp;
        
        System.out.println("Burbuja");
        for (i=prmArreglo.length-1; i>0; i--) {
            for (j=0; i> j; j++) {
                if (prmArreglo[j] > prmArreglo[j+1]) {
                    temp = prmArreglo[j];
                    prmArreglo[j] = prmArreglo[j+1];
                    prmArreglo[j+1] = temp;
                }
            }
        }
    }
    
    public void Burbuja(alumno prmArreglo[]) {
        int i, j; 
        alumno temp;
        
        System.out.println("Burbuja");
        for (i=prmArreglo.length-1; i>0; i--) {
            for (j=0; i> j; j++) {
                if (prmArreglo[j].getId() > prmArreglo[j+1].getId()) {
                    temp = prmArreglo[j];
                    prmArreglo[j] = prmArreglo[j+1];
                    prmArreglo[j+1] = temp;
                }
            }
        }
    }
    
    
    public void SeleccionDirecta(int prmArreglo[]) {
        int i, j, menor, posMenor, temp;
        int n = prmArreglo.length;
        System.out.println("Seleccion Directa");
        for (i=0; i < n; i++) {
            menor = prmArreglo[i];
            posMenor = i;
            for(j=i+1; j < n; j++){
                if (prmArreglo[j] < menor) {
                    menor = prmArreglo[j];
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                temp = prmArreglo[i];
                prmArreglo[i] = prmArreglo[posMenor];
                prmArreglo[posMenor] = temp;
            }
        }
    } 
    
    public void InsercionDirecta(int prmArreglo[]) {
        int i, j, valor;
        System.out.println("Insercion Directa");
        for (i=1; i< prmArreglo.length; i++) {
            valor = prmArreglo[i];
            for (j=i-1; j >=0 && prmArreglo[j] > valor; j--) {
                prmArreglo[j+1] = prmArreglo[j]; 
            }
            prmArreglo[j+1] = valor;
        }
    }
    
    public void ShellSort(int prmArreglo[]) {
        int i, j, k, temp, intervalo;
        System.out.println("Shell Sort");
        intervalo = prmArreglo.length/2;
        while (intervalo>0) {
            for (i=intervalo; i<prmArreglo.length; i++) {
                j = i - intervalo;
                while(j>=0) {
                    k = j + intervalo;
                    if (prmArreglo[j] <= prmArreglo[k]) {
                        j--;
                    } else {
                        temp = prmArreglo[j];
                        prmArreglo[j] = prmArreglo[k];
                        prmArreglo[k] = temp;
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    public void QuickSort(int prmArreglo[], int prmInicio, int prmFin) {
        int i, j, central, temp;
        int pivote;
//        System.out.println("Quick Sort");
        central = (prmInicio + prmFin) / 2;
        pivote = prmArreglo[central];
        i = prmInicio;
        j = prmFin;
        do {
            while (prmArreglo[i] < pivote) i++;
            while (prmArreglo[j] > pivote) j--;
            if (i <= j) {
                temp = prmArreglo[i];
                prmArreglo[i] = prmArreglo[j];
                prmArreglo[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (prmInicio < j)
            QuickSort(prmArreglo, prmInicio, j);
        if (i < prmFin)
            QuickSort(prmArreglo, i, prmFin);
    }
    
    public void MergeSort(int prmArreglo[], int prmInicio, int prmSize) {
        int n1, n2;
        
        if (prmSize > 1) {
            n1 = prmSize / 2;
            n2 = prmSize - n1;
            MergeSort(prmArreglo, prmInicio, n1);
            MergeSort(prmArreglo, prmInicio + n1, n2);
            Merge(prmArreglo, prmInicio, n1, n2);
        }
    }
    
    private void Merge (int prmArreglo[], int prmInicio, int n1, int n2) {
        int buffer[] = new int[n1 + n2];
        int temp = 0, temp1 = 0, temp2 = 0;
        while ((temp1 < n1) && (temp2 < n2)) {
            if (prmArreglo[prmInicio + temp1] < prmArreglo[prmInicio + n1 + temp2]) {
                buffer[temp++] = prmArreglo[prmInicio + (temp1++)];
            } else {
                buffer[temp++]= prmArreglo[prmInicio + n1 + (temp2++)];
            }
        }
        
        // Bucles de correcion de asignacion.
        while (temp1 < n1)
            buffer[temp++] = prmArreglo[prmInicio + (temp1++)];
        while (temp2 < n2)
            buffer[temp++]= prmArreglo[prmInicio + n1 + (temp2++)];
        
        // Bucle asignacion de buffer temporal a arreglo original
        for (int i=0; i < n1+n2; i++)
            prmArreglo[prmInicio+i] = buffer[i];
    }
}
