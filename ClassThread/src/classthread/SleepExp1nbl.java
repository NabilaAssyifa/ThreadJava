/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classthread;

/**
 *
 * @author Assyi
 */
public class SleepExp1nbl extends Thread 
{
    public void run()
    {
        for(int i=2;i<10;i++)
        {
            try
            {
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepExp1nbl thread1=new SleepExp1nbl();
        SleepExp1nbl thread2=new SleepExp1nbl();
        thread1.start();
        thread2.start();
    }
}
