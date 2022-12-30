public class Persona {

    // --- attributi
    private String nome;
    private String cognome;
    private Data dataNascita;

    // --- costruttori

    public Persona(String nome, String cognome){

        this.nome=nome;
        this.cognome=cognome;
        this.dataNascita=null;

    }
    public Persona(String nome, String cognome, Data dataNascita){

        this.nome=nome;
        this.cognome=cognome;
        this.dataNascita=dataNascita;

    }

    // --- get e set vari

    public String getCognome() {
        return cognome;
    }
    public Data getDataNascita() {
        return dataNascita;
    }
    public String getNome() {
        return nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setDataNascita(Data dataNascita) {
        this.dataNascita = dataNascita;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){

        return nome + " " + cognome;

    }

}
