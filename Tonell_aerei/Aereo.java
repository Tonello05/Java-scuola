class Aereo{

    int tempo_produziuone;
    String nome;

  public Aereo(int distanza, String nomeFabbrica, int tempo, int contatore){

    tempo_produziuone = tempo + (distanza / 10);
    nome = nomeFabbrica + contatore;

  }
  
}