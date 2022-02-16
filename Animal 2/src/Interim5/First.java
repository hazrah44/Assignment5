package Interim5;

public class First implements Runnable {
    private int i;

    public First(int i) {
        this.i = i;
    }

    public void run() {

        System.out.println("i = " + i +
               " Thread Name = " + Thread.currentThread().getName());
    }
}
