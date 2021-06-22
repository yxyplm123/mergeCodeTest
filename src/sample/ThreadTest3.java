package sample;


class ticketTest2 implements Runnable{

    private int ticket = 100;
    //Object obj = new Object();
    @Override
    public void run() {

        while (true){
            synchronized (this){

                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"卖票，票号为:"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }


        }
    }
}

public class ThreadTest3 {
    public static void main(String[] args) {
        ticketTest2 ticketTest2 = new ticketTest2();
        Thread  t1 = new Thread(ticketTest2);
        Thread  t2 = new Thread(ticketTest2);
        Thread  t3 = new Thread(ticketTest2);
        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
