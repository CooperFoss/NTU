public class Player {

    private int number;
    private float x,y,z=0;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void move(float xDisp, float yDisp){
        this.x+=xDisp;
        if (this.x<0 || this.x>100) this.x=50;
        this.y+=yDisp;
        if (this.y<0 || this.y>100) this.y=50;
    }
    public void jump(float zDisp){
        z += zDisp;
    }
    public boolean near(Ball ball){
        float distance = (float)  Math.sqrt(Math.pow(ball.getX()-this.x,2)+Math.pow(ball.getY()-this.y,2));
        return (distance<8);
    }
    public void kick(Ball ball){
        float kickx;
        if (number==2)
                kickx = (float) (Math.random()*-20);
        else kickx = (float) (Math.random()*20);
        float kicky;
                kicky = (float) (Math.random()*20-10);
                ball.setX(ball.getX()+kickx);
                ball.setY(ball.getY()+kicky);
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
