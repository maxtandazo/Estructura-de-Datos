
package estructura.ordenacion;

public class busqueda {
    public int Secuencia(int prmMatriz[], int prmValor) {
        int posicion = -1;
        
        for (int i = 0; i < prmMatriz.length; i++) {
            if (prmMatriz[i] == prmValor) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    public int Binaria(int prmMatriz[], int prmValor) {
        int posCentral, bajo, alto;
        int valCentral, posicion = -1;
        
        bajo = 0;
        alto = prmMatriz.length - 1;
        
        while (bajo <= alto) {
            posCentral = (bajo + alto) / 2;
            valCentral = prmMatriz[posCentral];
            if (valCentral == prmValor) {
                posicion = posCentral;
                break;
            } else if (prmValor > valCentral) {
                bajo = posCentral + 1;
            } else {
                alto = posCentral - 1;
            }
        }
        return posicion;
    }
}
