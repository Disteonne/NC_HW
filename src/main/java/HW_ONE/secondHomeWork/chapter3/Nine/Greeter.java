package HW_ONE.secondHomeWork.chapter3.Nine;

public class Greeter implements Runnable {

    private String target;
    private int n;

    public Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello "+target);
        }
    }

    public static void main(String[] args) {
        Thread firstThread=new Thread(new Greeter("firstThread",3));

        Thread secondThread=new Thread(new Greeter("secondThread",6));

        firstThread.start();
        secondThread.start();

    }
}
