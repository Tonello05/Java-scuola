/**
 * Autore: Tonello Samuele
 * Oggetto: classe che rappresenta un panino
 */
public class Panino {

    // --- attributi

    private String nome;
    private String[] ingredienti;
    private double prezzo;

    // --- costruttori

    public Panino(String nome, String[] ingredienti, double prezzo){

        this.nome=nome;
        this.ingredienti=ingredienti;
        this.prezzo=prezzo;

    }

    // --- get e set vari

    public String[] getIngredienti() {
        return ingredienti;
    }
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // --- metodi

    public String getInfo(){    // restituisce le info del panino
        return "nome: " + nome + " prezzo: " + prezzo;
    }

}