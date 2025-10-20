public class MyPoint {
    private int  x;
    private int y;
    public MyPoint(){};
    public MyPoint(int x, int y){};
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(MyPoint p){
        return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
}
