package Interim5;

    public class Main
    {
        public static void main(String[] args) throws InterruptedException
        {
            First getName = new First(1000);
            Thread t1 = new Thread(getName);
            t1.start();

            Second s = new Second();
            Thread t2 = new Thread(s);
            t2.start();
        }
    }

class Second implements Runnable
    {
        public void run()
        {
            for (int j = 0; j < 15; j++)
                System.out.println("Number of the Zebra in the zoo = " + j);
        }
    }

