package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingCarTest {
    final private RacingCar car = new RacingCar();

    @Test
    @DisplayName(value="레이싱 카 이동 테스트")
    public void moveRacingCarTest(){
        int prevPosition = car.getRacingCarPosition();
        car.moveRacingCar();
        assertThat(car.getRacingCarPosition()).isEqualTo(prevPosition+1);
    }

}
