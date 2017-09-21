package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class EventLogTest {

    @Test(expected = IllegalArgumentException.class)
    public void eventIsNullExpectFalse() {
        //arrange
        EventLog eventlog = new EventLog();

        //act
        eventlog.addEvent(null);

        //assert
    }

    @Test //(expected = IllegalArgumentException.class)
    public void eventNameIsNullExpectFalse() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setAction("Dance away!");

        //act
        eventlog.addEvent(event);

        //assert
        assertFalse("You cannot have an event without a name", event.name == null);


    }

}
