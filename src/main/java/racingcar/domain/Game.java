package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;


public class Game {
    public Game(){
    }

    public String[] inputRacingCarName(){
        String inputLine = Console.readLine();
        String[] racingCarNameList = inputLine.split(",");
        return racingCarNameList;
    }

    public boolean isValidRacingCarNameLength(String racingCarName){
        return racingCarName.length() <= 5 && racingCarName.length() > 0;
    }

    public boolean isValidRacingCarNameContainsSpace(String racingCarName){
        return !racingCarName.contains(" ");
    }

    public boolean isValidateCarName(String racingCarName){
        return isValidRacingCarNameLength(racingCarName) && isValidRacingCarNameContainsSpace(racingCarName);
    }
}
