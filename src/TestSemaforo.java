import java.util.concurrent.Semaphore;
public class TestSemaforo extends Thread {
    static int count = 0;
    static Semaphore semaphore = new Semaphore(1);
    String nome;
    public TestSemaforo(String nome) {
        this.nome = nome;
    }
    public void run() {
        try {
            System.out.println(nome + " sta ottenendo il permesso");
            semaphore.acquire();
            System.out.println(nome + " ha ottenuto il permesso");
            for(int i=0; i < 5; i++) {
                count++;
                System.out.println(nome + ": " + count);
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println(nome + " consegna il permesso");
        semaphore.release();
    }
}
