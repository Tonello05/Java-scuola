/*
 * Autore: Tonello Samuele
 * Oggetto: classe Animale
 */

public class Animale {

    // --- attributi

    protected String nome;
    protected Data dataNascita;
    protected String nomeProprietario;  //null se selvatico
    protected String cognomeProprietario;   //null se selvatico

    // --- costruttori

    public Animale(String nome, Data dataNascita, String nomeProprietario, String cognomeProprietario){
        this.nome=nome;
        this.dataNascita=dataNascita;
        this.nomeProprietario=nomeProprietario;
        this.cognomeProprietario=cognomeProprietario;
    }

    public Animale(String nome, Data dataNascita){
        this.nome=nome;
        this.dataNascita=dataNascita;
        nomeProprietario=null;
        cognomeProprietario=null;
    }

    // --- metodi

    public Data getDataNascita() {
        return dataNascita;
    }
    public String getNome() {
        return nome;
    }
    public void setDataNascita(Data dataNascita) {
        this.dataNascita = dataNascita;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}