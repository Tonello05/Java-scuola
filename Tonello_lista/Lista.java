public class Lista {
    
    // -- attributi

    private Nodo testa;

    // -- costruttori

    public Lista() {
        
        testa = null;

    }

    public Lista(Object elemento){

        Nodo tempNodo = new Nodo(elemento);

        testa=tempNodo;

    }

    // -- metodi

    public void addElementoDaTesta(Object elemento){    //aggiunge un elemento partendo dalla testa

        Nodo tempNodo = new Nodo(elemento);

        if(testa!=null){
            tempNodo.setNext(testa);
            testa=tempNodo;
        }else{
            testa=tempNodo;
        }
    }

    public Object getElemento(int index){       //restituisce un elemento dato il suo indice
        Nodo tempIndex=testa;

        for (int i = 0; i < index; i++) {
            tempIndex=tempIndex.getNext();
        }

        return tempIndex.getElemento();
    }

    public void clear(){    //svuota la lista

        testa = null;

    }
    
    public int addElementoDaIndice(Object elemento, int index){     //aggiunta di un elemento a un certo indice

        Nodo tempNodo = new Nodo(elemento);
        int error = 0;

        if(index<0)error=1;

        Nodo tempIndex=testa;
        Nodo tempIndex2=testa;


        tempIndex2=tempIndex2.getNext();

        for (int i = 0; i < index-1; i++) {
            tempIndex=tempIndex.getNext();
            tempIndex2=tempIndex2.getNext();
        }

        if(tempIndex2!=null){

            tempNodo.setNext(tempIndex2);
            tempIndex.setNext(tempNodo);

        }

        if(tempIndex2==null){
            error = 2;
        }

        return error;
    }

    

}
