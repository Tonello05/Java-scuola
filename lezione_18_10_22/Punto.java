public class Punto {
    
    // --- attributi
    double x;       //ascissa
    double y;       //ordinata
    String nome;    //nome


    // --- costruttori

    public Punto (double x, double y, String nome){

        this.x=x;
        this.y=y;
        this.nome=nome;

    }

    // --- metodi

    public double distanza(Punto punto) {   //metodo calcolo distanza
        
        double dist=0;  //distanza

            dist = Math.sqrt(Math.pow((punto.x-x),2)+Math.pow((punto.y-y),2));  //formula distanza due punti
            
        return dist;
    }

}