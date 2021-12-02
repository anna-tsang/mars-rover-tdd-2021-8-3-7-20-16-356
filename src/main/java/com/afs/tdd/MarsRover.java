package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        } else if(command.equals("L")){
            left();
        }
    }

    private void left(){
        if(direction.equals("N")){
            this.direction = "W";
        } else if (direction.equals("S")){
            this.direction = "E";
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
