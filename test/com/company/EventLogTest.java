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
        // test comes up as failed....I think that's good? because from the test case I provided, I want it to fail
    }

    @Test (expected = IllegalArgumentException.class)
    public void eventActionIsNullExpectFalse() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("Fundraiser Gala");

        //act
        eventlog.addEvent(event);
    }

    @Test (expected = IllegalArgumentException.class)
    public void eventActionIsF2FExpectTrue() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("Eharmony");
        event.setAction("Face2Face");

        //act
        eventlog.addEvent(event);
    }


}
