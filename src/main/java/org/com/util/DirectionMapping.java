package org.com.util;

public enum DirectionMapping {

    East(Direction.North, Direction.South),
    West(Direction.South, Direction.North),
    North(Direction.West, Direction.East),
    South(Direction.East, Direction.West);

    private Direction left;
    private Direction right;

    DirectionMapping(Direction left, Direction Right) {
        this.left = left;
        this.right = Right;
    }

    public Direction getLeft() {
        return left;
    }


    public Direction getRight() {
        return right;
    }


}


