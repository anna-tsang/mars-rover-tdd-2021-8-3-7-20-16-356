package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String WEST = "W";
    private static final String NORTH = "N";

    private static final String MOVE_FORWARD = "M";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

//    public void executeCommands(String commands) {
//        for (char command : commands.toCharArray()){
//            executeCommand(command);
//        }
//    }

    private void executeCommand(char command) {
        //String commandString = Character.toString(command);

        if(commandString.equals(MOVE_FORWARD)){
            move();
        } else if(commandString.equals(TURN_LEFT)){
            left();
        } else if(commandString.equals(TURN_RIGHT)){
            right();
        }
    }

    private void right() {
        if(direction.equals(NORTH)){
            this.direction = EAST;
        } else if(direction.equals(SOUTH)){
            this.direction = WEST;
        } else if(direction.equals(EAST)){
            this.direction = SOUTH;
        } else if(direction.equals(WEST)){
            this.direction = NORTH;
        }
    }


    private void left(){
        if(direction.equals(NORTH)){
            this.direction = WEST;
        } else if (direction.equals(SOUTH)){
            this.direction = EAST;
        } else if (direction.equals(EAST)){
            this.direction = NORTH;
        } else if (direction.equals(WEST)){
            this.direction = SOUTH;
        }

    }

    private void move(){
        if(this.direction.equals("N")){
            locationY++;
        } else if (this.direction.equals("S")){
            locationY--;
        } else if (this.direction.equals("E")){
            locationX++;
        } else if (this.direction.equals("W")){
            locationX--;
        }
    }

    public String getStatus() {
        return String.format("%d %d %s",locationX, locationY, direction);
    }
}
