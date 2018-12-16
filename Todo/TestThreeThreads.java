/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
public class TestThreeThreads {
    public static void main(String[] args) {
        Thread t1, t2, t3;
        PrintMe p=new PrintMe();
        t1= new Thread(p);
        t1.setName("Uno ");
        t2= new Thread(p);
        t2.setName("Dos ");
        t3= new Thread(p);
        t3.setName("Tres ");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
