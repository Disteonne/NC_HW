package HW_JAVA.secondHomeWork.chapter3.Ten;

public class NewClass {

    /*
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
     */

    public static void runTogether(Runnable... tasks){
        Runnable run = () ->{
            for (Runnable task:tasks) new Thread(task).start();
        };
    }
    public static void runInOrder(Runnable... tasks){
        Runnable run = () ->{
            for (Runnable task:tasks) task.run();
        };
    }
}
