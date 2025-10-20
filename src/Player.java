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
        x+=xDisp;
        y+=yDisp;
    }
    public void jump(float zDisp){
        z = zDisp;
    }
}
