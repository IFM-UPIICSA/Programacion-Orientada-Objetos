/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
public class PrintMe implements Runnable{
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName()+" "+i);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    
}
