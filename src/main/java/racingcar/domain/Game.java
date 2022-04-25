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

    public int isValidateCarName(String racingCarName){
        if(isValidRacingCarNameLength(racingCarName) && isValidRacingCarNameContainsSpace(racingCarName)){
            return 1;
        }
        return 0;
    }

    public boolean checkAllCarNameValidations(String[] racingCarNames){
        int count = 0;
        for(int idx = 0; idx<racingCarNames.length; idx++){
            count += isValidateCarName(racingCarNames[idx]);
        }
        if(count == racingCarNames.length){
            return true;
        }
        return false;
    }
}
