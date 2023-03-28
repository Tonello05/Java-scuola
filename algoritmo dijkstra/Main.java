public class Main {
    public static void main(String[] args) {
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoCasa = new Nodo("CASA");
        Nodo nodoUfficio = new Nodo("UFFICIO");

        nodoCasa.link(nodoA, 2);
        nodoCasa.link(nodoD, 8);
        nodoA.link(nodoCasa, 2);
        nodoA.link(nodoB, 6);
        nodoA.link(nodoC, 2);
        nodoD.link(nodoC, 2);
        nodoD.link(nodoCasa, 8);
        nodoD.link(nodoE, 3);
        nodoC.link(nodoE,9);
        nodoC.link(nodoA,2);
        nodoC.link(nodoD,2);
        nodoB.link(nodoA, 6);
        nodoB.link(nodoUfficio, 5);
        nodoE.link(nodoD, 3);
        nodoE.link(nodoC, 9);
        nodoE.link(nodoUfficio, 1);
        nodoUfficio.link(nodoE, 1);
        nodoUfficio.link(nodoB, 5);

        Dijkstra.dijkstra(nodoCasa);
        Dijkstra.getPath(nodoUfficio);

    }

}
