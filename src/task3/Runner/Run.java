package task3.Runner;


import task3.Entity.ColorsEnum;
import task3.Entity.Ball;
import task3.Entity.NoFormatException;
import task3.Entity.Service;

public class Run {

    public static void main(String[] args) throws NoFormatException {
        Ball ball = new Ball(15, ColorsEnum.WHITE);
        Ball ball1 = new Ball(20, ColorsEnum.BLUE);
        Ball ball2 = new Ball(25, ColorsEnum.RED);
        Service service = new Service();
        service.addBalls(ball);
        service.addBalls(ball1);
        service.addBalls(ball2);
        System.out.println("The number of ball : " + service.numberOfBalls());
        System.out.println("Show all : " +  service.showAllBalls());
        System.out.println("colors in list: " + service.colorOfBalls().toString());
        service.remove(ball);
        System.out.println("Show all after removing: " +  service.showAllBalls());
        service.clearBasket();

    }
}
