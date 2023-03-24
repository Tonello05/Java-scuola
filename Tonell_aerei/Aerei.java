/**
 * main
 */

import java.util.LinkedList;
import java.util.Queue;

public class Aerei {

  public static void main(String[] args) {
    Queue<Aereo> buffer = new LinkedList<>();
    int maxSize = 10;

    Thread Fabbrica= new Thread(new Fabbrica(buffer, maxSize, "alpha", 500, 800), "Producer");
    Thread Fabbrica1= new Thread(new Fabbrica(buffer, maxSize, "bravo", 450, 400), "Producer");
    Thread Fabbrica2= new Thread(new Fabbrica(buffer, maxSize, "charlie", 600, 300), "Producer");
    Thread Fabbrica3= new Thread(new Fabbrica(buffer, maxSize, "delta", 350, 600), "Producer");
    Thread Fabbrica4= new Thread(new Fabbrica(buffer, maxSize, "echo", 720, 200), "Producer");

    Thread Trasportatore = new Thread(new Trasportatore(buffer, maxSize, 3, 2000, "Marines"), "Consumer");
    Thread Trasportatore1 = new Thread(new Trasportatore(buffer, maxSize, 5, 2300, "US Navy"), "Consumer");
    Thread Trasportatore2 = new Thread(new Trasportatore(buffer, maxSize, 7, 1500, "Air Force"), "Consumer");


    Fabbrica.start();
    Fabbrica1.start();
    Fabbrica2.start();
    Fabbrica3.start();
    Fabbrica4.start();
    Trasportatore1.start();
    Trasportatore.start();
    Trasportatore2.start();
  }

}
