package io.mani.gerete;

public class KaffeeMachine extends  Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Coffee is Finished " + (9 - i));
        }
    }
}
