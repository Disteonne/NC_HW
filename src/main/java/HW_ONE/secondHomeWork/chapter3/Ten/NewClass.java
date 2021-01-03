package HW_ONE.secondHomeWork.chapter3.Ten;

public class NewClass {

    public static void runTogether(Runnable... tasks){
        for (Runnable run:tasks
             ) {
            new Thread(run).start();
        }
    }
    public static void runInOrder(Runnable... tasks){

        for (Runnable element:tasks
             ) {

            element.run();

        }
    }

    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        };
        /*
        runnable.run();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println(thread.getName());
         */
        NewClass.runInOrder(runnable);

    }

}
