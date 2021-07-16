package io.mani;

import io.mani.gerete.KaffeeMachine;
import io.mani.gerete.Toaster;

public class Main {

    public static void main(String[] args) {
        KaffeeMachine kocher = new KaffeeMachine();
        Toaster toaster = new Toaster();
        System.out.println("Wellcome to \"Die Bohne\"!! ***************************** ");
        // kocher.run();
        // toaster.run();
        kocher.start();
        toaster.start();

        while (kocher.isAlive() || toaster.isAlive()) {
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Clean Table Nr: " + i);
        }
        System.out.println("\n********* We are Closing now . See you agian Soon !! in \"Die Bohne!!\"**********************");


    }
}
