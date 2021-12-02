package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_locationY_add_one_when_execute_given_direction_N_and_command_M(){
        MarsRover marsRover = new MarsRover("0","0","N");
        String command = "M";

        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        assertEquals("0 1 N", result);
    }
}
