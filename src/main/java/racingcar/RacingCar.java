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
}
