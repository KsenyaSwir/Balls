package task3.Entity;


public class Ball {
    private int weight = 0;
    private ColorsEnum color;

    public Ball() {
    }

    public Ball(int weight) throws NoFormatException{
        if(weight != 0 ){
            setWeight(weight);
        }
    }
    public Ball(ColorsEnum color) throws NoFormatException{
        if(color != null){
            setColor(color);
        }
    }

    public Ball(int weight, ColorsEnum color) throws NoFormatException{
        setWeight(weight);
       this.color = color;
    }

    public int getWeight() throws NoFormatException {
        if (weight != 0) {
            return weight;
        } else throw new NoFormatException("No weight");
    }

    public void setWeight(int weight) throws NoFormatException {
        if(weight > 0){
            this.weight = weight;
        }
        else throw new NoFormatException("invalid weight");
    }

    public String getColor() throws NoFormatException {
        if (color != null) {
            return color.name();
        }
        else throw new NoFormatException("No color");
    }

    public void setColor(ColorsEnum color)throws NoFormatException {
        if(color != null){
            this.color = color;
        }
        throw new NoFormatException("invalid color");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (weight != ball.weight) return false;
        return color == ball.color;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

