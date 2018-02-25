package org.com.wc;

import org.com.exception.InvalidInputFormat;
import org.com.util.Position;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarParkingSystem {

    private static final String INPUT_REGEX = "([0-9]|1[0-5]),([0-9]|1[0-5]):([FLR]+)";
    private static final char RIGHT = 'R';
    private static final char LEFT = 'L';

    public Position getEndPosition(String input) {
        Matcher matcher = Pattern.compile(INPUT_REGEX).matcher(input);

        if (!matcher.matches()) {
            throw new InvalidInputFormat(input, INPUT_REGEX);
        }

        int vertical = Integer.parseInt(matcher.group(1));
        int horizontal = Integer.parseInt(matcher.group(2));
        Position startPosition = new Position(vertical, horizontal);
        String moves = matcher.group(3);
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            if (move == LEFT) {
                startPosition.turnLeft();
            } else if (move == RIGHT) {
                startPosition.turnRight();
            } else {
                startPosition.forward();
            }

        }

        System.out.println(startPosition.getVertical() + "'" + startPosition.getHorizontal());
        return startPosition;
    }


    public static void main(String[] args) {

        CarParkingSystem carParkingSystem = new CarParkingSystem();
        carParkingSystem.getEndPosition("5,5:RFLFRFLF");
        carParkingSystem.getEndPosition("6,6:FFLFFLFFLFF");
        carParkingSystem.getEndPosition("5,5:FLFLFFRFFF");

    }
}
