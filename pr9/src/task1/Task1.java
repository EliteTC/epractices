package task1;

public class Task1 {
    static void task1(){
        ((Runnable) () -> {
            for (int i = 10; i > 0; --i) {
                System.out.println(i + "...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("BOOM");
        }).run();
    }



}
