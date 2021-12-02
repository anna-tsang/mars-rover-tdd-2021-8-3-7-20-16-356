package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_locationY_add_one_when_execute_given_direction_N_and_command_M(){
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "M";

        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        assertEquals("0 1 N", result);
    }

    @Test
    void should_locationY_minus_one_when_execute_given_direction_S_and_command_M(){
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "M";

        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        assertEquals("0 -1 S", result);
    }

    @Test
    void should_locationX_add_one_when_execute_given_direction_E_and_command_M(){
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "M";

        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        assertEquals("1 0 E", result);
    }
}
