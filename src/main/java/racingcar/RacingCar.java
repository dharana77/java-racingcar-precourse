package racingcar;

public class RacingCar {

    public RacingCar(){
    }

    private int position;

    public int getRacingCarPosition(){
        return this.position;
    }

    public void moveRacingCar(){
        this.position += 1;
    }

    public String positionToString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.position);
        for(int idx = 0; idx < this.position; idx++){
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
