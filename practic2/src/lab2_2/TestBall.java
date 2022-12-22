package lab2_2;



public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball = new Ball(100.0, 100.0);
        System.out.println(ball);

        ball.move(32.0, 17.0);
        System.out.println(ball);
    }
}
