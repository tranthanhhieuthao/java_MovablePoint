public class MovablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;

    public MovablePoint(){
    }

    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed =ySpeed;
    }

    public MovablePoint(float x, float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed(){
        return this.xSpeed;
    }

    public float getySpeed(){
        return this.ySpeed;
    }

    public void setxSpeed(float xSpeed){
        this.xSpeed =xSpeed;
    }

    public void setySpeed(float ySpeed){
        this.ySpeed =ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public String getSpeed(){
        return "Array of speed {"+this.xSpeed+","+this.ySpeed+"}";
    }

    @Override
    public String toString(){
        return "("+super.getX() +","+super.getY()+")"+","+getSpeed()+" "+"="+" "+"("+this.xSpeed+","+this.ySpeed+")";
    }

    public void move(){
        super.x += this.xSpeed;
        super.y += this.ySpeed;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint =new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5,6,12,14);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);

    }


}
