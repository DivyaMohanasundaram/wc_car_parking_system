package org.com.wc;

import org.com.exception.InvalidInputFormat;
import org.com.exception.OutOfBoundsException;
import org.com.util.Position;
import org.junit.Assert;
import org.junit.Test;


public class CarParkingSystemTest {

    @Test(expected = InvalidInputFormat.class)
    public void getPositionShouldThrowInvalidInputException() throws Exception {
        String input = "444534FFF";
        CarParkingSystem carParkingSystem = new CarParkingSystem();
        carParkingSystem.getEndPosition(input);
    }

    @Test(expected = OutOfBoundsException.class)
    public void getPositionShouldThrowOutOfBoundException() throws Exception {
        String input = "15,0:F";

        CarParkingSystem carParkingSystem = new CarParkingSystem();
        carParkingSystem.getEndPosition(input);
    }

    @Test
    public void test_1_getEndPosition() throws Exception {
        String input = "5,5:RFLFRFLF";

        CarParkingSystem carParkingSystem = new CarParkingSystem();
        Position endPosition = carParkingSystem.getEndPosition(input);

        Assert.assertEquals(7,endPosition.getHorizontal() );
        Assert.assertEquals(7, endPosition.getVertical() );

    }

    @Test
    public void test_2_getEndPosition() throws Exception {
        String input = "6,6:FFLFFLFFLFF";

        CarParkingSystem carParkingSystem = new CarParkingSystem();
        Position endPosition = carParkingSystem.getEndPosition(input);

        Assert.assertEquals(6,endPosition.getHorizontal() );
        Assert.assertEquals(6, endPosition.getVertical() );

    }

    @Test
    public void test_3_getEndPosition() throws Exception {
        String input = "5,5:FLFLFFRFFF";

        CarParkingSystem carParkingSystem = new CarParkingSystem();
        Position endPosition = carParkingSystem.getEndPosition(input);

        Assert.assertEquals(4,endPosition.getVertical() );
        Assert.assertEquals(1, endPosition.getHorizontal() );

    }

}
