/**
 * Autore: Tonello Samuele
 * Oggetto: nodo
 */

public class Nodo{

    // -- attributi
    
    private Object elemento;
    private Nodo next;

    // -- costruttori

    public Nodo(Object elemento) {
        
        this.elemento=elemento;

    }

    // -- metodi

    public Object getElemento() {
        return elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}