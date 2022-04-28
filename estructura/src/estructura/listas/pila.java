
package estructura.listas;

public class pila {
    nodo cima;
    
    public pila() {
        cima = null;
    }
    
    public void mostrar() {
        nodo temp = cima;
        
        if (cima == null) {
            System.out.println("La pila esta vacia.........");
        }
        
        while (temp != null) {
            System.out.print(temp.Dato + " -> ");
            temp = temp.Sig;
        }
        System.out.println("");
    }
    
    public void push(int prmDato) {
        nodo temp = new nodo();
        
        temp.Dato = prmDato;
        temp.Sig = null;
        
        if (cima != null) {
            temp.Sig = cima;
        }
        cima = temp;
    }
    
    public int info() {
        return cima.Dato;
    }
    
    public void pop() {
        if (cima == null) {
            System.out.println("La pila esta vacia......");
        } else {
            cima = cima.Sig;
        }
    }
    
    public boolean esVacia() {
        boolean estado = true;
        if (cima != null) {
            estado = false;
        }
        return estado;
    }
}
