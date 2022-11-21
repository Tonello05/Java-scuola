public class Punto {
    
    // --- attributi
    private double x;       //ascissa
    private double y;       //ordinata
    private String nome;    //nome


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

    public java.lang.String getNome() {
        return nome;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString(){

        return nome + ": x:" + x + " y:" +y;

    }

}