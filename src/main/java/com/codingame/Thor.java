package com.codingame;

public class Thor {
    private final int initialTX;
    private final int initialTY;

    public Thor(int initialTX, int initialTY) {
        this.initialTX = initialTX;
        this.initialTY = initialTY;
    }

    public String moves(int lightX, int lightY) {
        String direction = "";
        if (lightX < initialTX && lightY == initialTY) {
            direction = "O";
        } else if (lightX == initialTX && lightY < initialTY) {
            direction = "N";
        } else if (lightX > initialTX && lightY == initialTY) {
            direction = "E";
        } else if (lightX == initialTX && lightY > initialTY) {
            direction = "S";
        } else if (lightX > initialTX && lightY > initialTY) {
            direction = "SE";
        } else if (lightX < initialTX && lightY > initialTY) {
            direction = "SO";
        } else if (lightX < initialTX && lightY < initialTY) {
            direction = "NO";
        } else if (lightX > initialTX && lightY < initialTY) {
            direction = "NE";
        }
        return direction;
    }
}
