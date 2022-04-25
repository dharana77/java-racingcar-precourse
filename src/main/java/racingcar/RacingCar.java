package racingcar;

public class RacingCar {

    private int position;

    public RacingCar(){
    }
    
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
