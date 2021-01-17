package HW_JAVA.firstHomeWork.partTwo;

public class Main {
    public static void main(String[] args) {
        try {
            Container container = new Container(0, 0, 15, 15);
            Ball ball = new Ball(5, 5, 1, 1, 45);
            do{
                ball.move();
                System.out.println(ball);
            }while (container.collides(ball));
            System.out.println("Ball out of bounds");
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
