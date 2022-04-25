package racingcar.controller;

import racingcar.domain.Game;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;

import java.util.LinkedList;
import java.util.List;

public class RacingGame {
    private List<RacingCar> racingCarList = new LinkedList<>();
    private RacingCars racingCars = new RacingCars();

    public RacingGame(){
    }

    public void playGame(){
        Game game = new Game();
        String[] carNameList = game.inputRacingCarName();
        game.checkIllegalCarNameInputs(carNameList);
        for(int idx=0; idx<carNameList.length; idx++){
            RacingCar racingCar = new RacingCar(carNameList[idx]);
            racingCars.addCar(carNameList[idx]);
        }
//        int repeatCount = game.inputRepeatCount();
//        while(repeatCount){
//            generateRandomNumber();
//            repeatCount--;
//        }

    }
}
