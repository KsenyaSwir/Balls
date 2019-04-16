package task3.Entity;

import task3.BallCard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Service implements BallCard {


    private List<Ball> balls = new ArrayList<>();

    {
        String temp = "white    ";
        try {
            balls.add(new Ball(13, ColorsEnum.BLUE));
        } catch (NoFormatException e) {
            e.printStackTrace();
        }
        try {
            balls.add(new Ball(17,  ColorsEnum.valueOf("RED")));
        } catch (NoFormatException e) {
            e.printStackTrace();
        }
        try {
            balls.add(new Ball(10, ColorsEnum.valueOf(temp.toUpperCase().trim())));
        } catch (NoFormatException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void addBalls(Ball ball) throws NoFormatException{
        if (ball != null) {
            balls.add(ball);
        }
        else throw new NoFormatException("No ball to be added");
    }

    @Override
    public int numberOfBalls() throws NoFormatException {
        if (balls != null) {
            return balls.size();
        } else throw new NoFormatException("No size");
    }

    @Override
    public HashSet colorOfBalls() {
        HashSet<String> set = new HashSet<>();
        for (Ball ball : balls) {
            try {
                set.add(ball.getColor());
            } catch (NoFormatException e) {
                e.getMessage();
            }
        }
        return set;
    }

    @Override
    public String showAllBalls() throws NoFormatException{
        if(balls.size() != 0) {
            String ballName = "";
            for (Ball ball : balls) {
                ballName = ballName + ball + " ";
            }
            return ballName;
        }
        else throw new NoFormatException("The basket is empty");
    }


    @Override
    public void remove(Ball ball) {
        balls.remove(ball);
    }

    @Override
    public void clearBasket() throws NoFormatException{
        if (balls != null) {
            balls.clear();
        }
        else throw new NoFormatException("The basket is empty");
    }
}
