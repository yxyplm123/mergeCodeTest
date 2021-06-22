package sample;


class ticketTest extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();
    //任何一对象可以充当锁
    @Override
    public void run() {
        while (true){
            show();
        }
    }

    private synchronized void show(){

                if(ticket >0){
                   /* try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/

                    System.out.println(Thread.currentThread().getName()+"买票，票号为"+ticket);
                    ticket--;
                }else {
                    return;
                }
    }
}
public class ThreadTest2{

    public static void main(String[] args) {
        ticketTest t1 = new ticketTest();
        ticketTest t2 = new ticketTest();
        ticketTest t3 = new ticketTest();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
