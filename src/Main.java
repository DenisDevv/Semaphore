public class Main {
    public static void main(String[] args) throws InterruptedException {
        TestSemaforo semaforo = new TestSemaforo("A");
        TestSemaforo semaforo2 = new TestSemaforo("B");
        semaforo.start();
        semaforo2.start();
        semaforo.join();
        semaforo2.join();
        System.out.println("Terminato il conteggio condiviso: " + TestSemaforo.count);
    }
}