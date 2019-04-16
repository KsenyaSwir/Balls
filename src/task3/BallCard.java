package task3;

import task3.Entity.Ball;
import task3.Entity.NoFormatException;

import java.util.HashSet;

public interface BallCard {
    int numberOfBalls() throws NoFormatException;
    HashSet colorOfBalls();
    void addBalls(Ball ball) throws NoFormatException;
    void remove(Ball ball);
    String showAllBalls() throws NoFormatException;
    void clearBasket() throws NoFormatException;
}
