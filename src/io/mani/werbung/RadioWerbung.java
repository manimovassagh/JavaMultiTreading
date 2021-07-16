package io.mani.werbung;

public class RadioWerbung extends Werbung {
    public void run() {
        for (int i = 0; i < 10; i++) {
          super.werben();
          try {
              Thread.sleep(500);
          } catch (InterruptedException e){
              e.printStackTrace();
          }
        }
    }
}
