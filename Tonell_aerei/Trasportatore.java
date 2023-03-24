import java.util.Queue;

class Trasportatore extends Lavoratore implements Runnable {
   private final Queue<Aereo> buffer;
   private final int maxSize;
   private int richiesti;
   private int tempistiche;

   public Trasportatore(Queue<Aereo> buffer, int maxSize, int richiesti, int tempistiche, String nome) {
    this.nome=nome;
    this.richiesti = richiesti;
    this.tempistiche = tempistiche;
    this.buffer = buffer;
    this.maxSize = maxSize;
    tempo_totale = 0;
   }
 
   @Override
   public void run() {
      while (tempo_totale < (365*20)) {
         try {
            consume();
            Thread.sleep((int)(Math.random()*10000));
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         
      }
      System.out.println("l'ente è stato distrutto");
   }
 
   private void consume() throws InterruptedException {
      synchronized (buffer) {
         while (buffer.size() < 3) {
            System.out.println("Magazzino vuoto aspetto nuovi aerei...");
            buffer.wait();
         }
         for (int i = 0; i < 3; i++) {
            Aereo temp = buffer.poll();
            System.out.println(nome + " ha trasportato un aereo [ nome: " + temp.nome + "]");
            buffer.notifyAll();
            tempo_totale += temp.tempo_produziuone;
         }

      }
   }
}