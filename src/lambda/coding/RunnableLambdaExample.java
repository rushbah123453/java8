package lambda.coding;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /* ---- prior java8 ---- */
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1");
            }
        };

        new Thread(runnable).start();

        /* ---- after java8 ---- */

        Runnable runnableLambda=() -> {
            System.out.println("Runnable 2");
        };

        new Thread(runnableLambda).start();

        new Thread(()-> System.out.println("Runnable 3")).start();

    }
}
