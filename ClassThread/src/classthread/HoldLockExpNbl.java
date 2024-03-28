/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classthread;

/**
 *
 * @author Assyi
 */
public class HoldLockExpNbl implements Runnable {
    public void run()
    {
        System.out.println("Currently executing thread is: " + Thread.currentThread().getName());
        System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
        synchronized (this)
        {
            System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
        }
    }
    public static void main(String[] args) {
        HoldLockExpNbl gl = new HoldLockExpNbl();
        Thread thread1 = new Thread(gl);
        thread1.start();
    }
}
