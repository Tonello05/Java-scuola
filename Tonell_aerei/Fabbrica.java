import java.util.Queue;

class Fabbrica extends Lavoratore implements Runnable {
   private final Queue<Aereo> buffer;
   private final int maxSize;
   private int aerei_prodotti = 0;

   public Fabbrica(Queue<Aereo> buffer, int maxSize, String nome, int distanza, int tmp_produzione) {
      this.nome=nome;
      this.distanza = distanza;
      this.tmp_prudzione = tmp_produzione;
      this.buffer = buffer;
      this.maxSize = maxSize;
      tempo_totale = 0;
   }
 
   @Override
   public void run() {
      while (tempo_totale < (365*20)) {
         try {
            produce();
            Thread.sleep((int)(Math.random()*10000));
         } catch (InterruptedException e) {
            e.printStackTrace();
         }

      }
      System.out.println("la fabbrica è stata distrutta");
   }
 
   private void produce() throws InterruptedException {
      synchronized (buffer) {
         aerei_prodotti++;
         while (buffer.size() == maxSize) {
            System.out.println("magazzino pieno apetto che si svuoti...");
            buffer.wait();
         }
         Aereo temp = new Aereo(distanza, nome, tmp_prudzione, aerei_prodotti);
         buffer.offer(temp);
         System.out.println(this.nome + " ha prodotto un aereo [ nome: " + temp.nome + "] in " + temp.tempo_produziuone + " gg" );
         buffer.notifyAll();
         tempo_totale += temp.tempo_produziuone;

      }
   }
}