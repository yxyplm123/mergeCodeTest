package sample;


class helloThread extends Thread{
    @Override
    public void run() {

        for (int i=0;i<100;i++){
            if(i%2==0){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        helloThread h1 = new helloThread();
        h1.start();
        for (int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
         if(i==20){
             h1.join();
         }

        }
    }
}
