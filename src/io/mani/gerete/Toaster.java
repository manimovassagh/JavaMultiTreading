package io.mani.gerete;

public class Toaster extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Toasting is finished " + (9 - i));
        }
    }
}
