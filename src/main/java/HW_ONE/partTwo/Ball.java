package HW_ONE.partTwo;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    private int speed;
    private int directions;

    public Ball(float x, float y, int radius, int speed, int directions) throws Exception {
        checkDirection();
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speed = speed;
        this.directions = directions; //degrees
        this.xDelta=(float) (speed*Math.cos(degreesToRad()));
        this.yDelta=(float) (-speed*Math.sin(degreesToRad()));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    private float degreesToRad(){
        return (float) Math.PI*directions/180;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void  reflectHorizontal(){
        xDelta=-xDelta;
    }

    public void  reflectVertical(){
        yDelta=-yDelta;
    }

    private void checkDirection() throws Exception {
        if(this.directions>=-180 && this.directions<=180){
            throw new Exception("Out of bounds. -180<=Direction<=180.");
        }
    }

}
