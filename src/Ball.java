public class Ball
{
    private float x,y,z,xDelta,yDelta;
    private int radius;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Ball(float x, float y, int radius, float xDelta, float yDelta)
    {

    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                ", radius=" + radius +
                '}';
    }
}
