import java.util.concurrent.TimeUnit;

/**
 * @Author: lichao
 * @Date: 2021/6/4 16:44
 * @Descr: $
 */
public class Test {
    private volatile
    static int number = 0;
    //
    public static void main(String [] args){
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"--"+number);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            add6();
            System.out.println(Thread.currentThread().getName()+"--"+number);
        }).start();
        while(number == 0){

        }
        System.out.println(Thread.currentThread().getName()+"---"+number);
    }

    private static void add6(){
        number = 60;
    }
}
