package racingcar;

import camp.nextstep.edu.missionutils.Console;


public class Game {
    public Game(){
    }

    public void inputRacingCarName(){
        String inputLine = Console.readLine();
        String[] racingCarNameList = inputLine.split(",");
    }

    public boolean isValidRacingCarName(String racingCarName){
        return racingCarName.length() <= 5 && racingCarName.length() > 0;
    }

}
