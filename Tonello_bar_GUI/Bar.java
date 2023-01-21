/*
 * Autore: Tonello Samuele
 * Oggetto: classe rappresentativa di un bar
 */

import java.util.Vector;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;

public class Bar {
    
    // --- attributi

    private Vector<Servizio> servizi;
    private String nome;

    // --- costruttori

    public Bar(String nome){
        this.nome=nome;
        servizi = new Vector<Servizio>(1,0);
    }

    // --- get e set

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Vector<Servizio> getServizi() {
        return servizi;
    }
    public void setServizi(Vector<Servizio> servizi) {
        this.servizi = servizi;
    }

    // --- metodi

    public void nuovoOrdine(){    //aggiungi un servizio in coda

        int i=0,x=0;
        Scanner input = new Scanner();
        System.out.println("quanti panini si vuole oridnare? ");
        i=input.nextInt();
        Panino[] panini = new Panino[i];

        for (int j = 0; j < i; j++) {
            System.out.println("nome panino: ");
            String nome = input.nextString();
            System.out.println("prezzo panino: ");
            double prezzo = input.nextDouble();
            System.out.println("quanti ingredienti ha il panino?");
            x=input.nextInt();
            String ingredienti[]= new String[x];
            for(int z=0; z<x; z++){
                System.out.println((z+1) + " ingrediente: ");
                ingredienti[z]=input.nextString();
            }

            panini[j]= new Panino(nome, ingredienti, prezzo);
        }
        System.out.println("nome cliente: ");
        String nome = input.nextString();
        System.out.println("cognome cliente: ");
        String cognome = input.nextString();
        Persona persona1 = new Persona(nome, cognome); 
        Servizio servizio1 = new Servizio(panini, persona1);

        servizi.add(servizio1);

    }

    public void nuovoOrdine(Servizio servizio1){
        servizi.add(servizio1);
    }

    public Servizio completaOrdine(){           //completa l'ordine meno recente

        salvaServizio(servizi.get(0));
        return servizi.remove(0);

    }

    public void stampaCoda(){

        for (int i = 0; i <= servizi.size()-1; i++) {
            
            System.out.println(servizi.get(i).toString());

        }
    }

    public void salvaServizio(Servizio servizio1){

        try {
            
        FileOutputStream fileOut = new FileOutputStream("ServiziSalvati");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(servizio1);
        objectOut.close();
    
        } catch (Exception e) {
            
        }

    }

}
