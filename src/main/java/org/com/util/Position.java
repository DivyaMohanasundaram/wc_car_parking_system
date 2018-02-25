package org.com.util;


import org.com.exception.OutOfBoundsException;

public class Position {

    private static final int MAX_GRID_SIZE = 15;
    private static final int MIN_GRID_SIZE = 0;

    private int vertical = -1;
    private int horizontal = -1;
    private Direction direction = Direction.North;


    public Position(int vertical, int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public void turnLeft() {
        direction = DirectionMapping.valueOf(direction.name()).getLeft();
    }

    public void turnRight() {
        direction = DirectionMapping.valueOf(direction.name()).getRight();
    }

    public void forward() {
        if (direction == Direction.South) {
            vertical--;
        } else if (direction == Direction.North) {
            vertical++;
        } else if (direction == Direction.West) {
            horizontal--;
        } else {
            horizontal++;
        }

        if (vertical < MIN_GRID_SIZE || vertical > MAX_GRID_SIZE ||
                vertical < MIN_GRID_SIZE || horizontal > MAX_GRID_SIZE) {
            throw new OutOfBoundsException(vertical, horizontal);
        }
    }


    public int getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }
}
