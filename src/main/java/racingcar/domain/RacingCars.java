package racingcar.domain;

import java.util.LinkedList;
import java.util.List;

public class RacingCars {
    private List<String> racingCars = new LinkedList<>();

    public RacingCars(){
    }

    public void addCar(String racingCar){
        racingCars.add(racingCar);
    }

    public List<String> returnRacingCars(){
        return racingCars;
    }
}
