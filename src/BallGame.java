public class BallGame {
    public static void main(String[] args) {
        Player red1 = new Player(1, 0, 66, 0);
        Player red2 = new Player(2, 0, 33, 0);
        Player blue1 = new Player(1, 100, 33, 0);
        Player blue2 = new Player(2, 100, 66, 0);
        Ball ball = new Ball(50, 50, 0);
        boolean done = false;

        while(!done) {
            System.out.println(ball.toString());
            System.out.println(red1.toString());
            red1.move((float) Math.random() * 10 - 5, (float) Math.random() * 10 - 5);
            red2.move((float) Math.random() * 10 - 5, (float) Math.random() * 10 - 5);
            blue1.move((float) Math.random() * 10 - 5, (float) Math.random() * 10 - 5);
            blue2.move((float) Math.random() * 10 - 5, (float) Math.random() * 10 - 5);

            if (red1.near(ball)) red1.kick(ball);
            if (red2.near(ball)) red1.kick(ball);
            if (blue1.near(ball)) red1.kick(ball);
            if (blue2.near(ball)) red1.kick(ball);

            if (ball.getX() <= 0) {
                done = true;
                System.out.println("Blue scored");
            }

            if (ball.getX() >= 100) {
                done = true;
                System.out.println("Red scored");
            }
        }
    }
}
