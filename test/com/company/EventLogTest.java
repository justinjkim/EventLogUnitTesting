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

    @Test(expected = IllegalArgumentException.class)
    public void eventNameIsNullExpectFalse() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setAction("Dance away!");

        //act
        eventlog.addEvent(event);

        //assert
        //assertFalse("You cannot have an event without a name", event.name == null);
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

    @Test
    public void eventCorrectlyAddedExpectTrue() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("BBQ at the Beach");
        event.setAction("Face2Face");

        //act
        eventlog.addEvent(event);
    }

    @Test
    public void eventActionIsF2FExpectTrue() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("Eharmony");
        event.setAction("Face2Face");

        //act
        eventlog.addEvent(event);

        //assert
        assertTrue("Face2Face Test has passed", event.action == "Face2Face");
    }

    @Test
    public void eventActionIsPhonecallExpectTrue() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("Date Night");
        event.setAction("PhoneCall");

        //act
        eventlog.addEvent(event);

        //assert
        assertTrue("PhoneCall Test has passed", event.action == "PhoneCall");
    }

    @Test
    public void eventActionIsTextMessagingExpectTrue() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("Bono Tickets Raffle");
        event.setAction("TextMessaging");

        //act
        eventlog.addEvent(event);

        //assert
        assertTrue("TextMessaging Test has passed", event.action == "TextMessaging");
    }

    @Test
    public void eventActionIsUnknownExpectTrue() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("What?");
        event.setAction("Unknown");

        //act
        eventlog.addEvent(event);

        //assert
        assertTrue("Unknown Test has passed", event.action == "Unknown");
    }

    @Test (expected = IllegalArgumentException.class)
    public void eventActionIsNotRecognizedExpectFalse() {
        //arrange
        EventLog eventlog = new EventLog();
        Event event = new Event();
        event.setName("Mozart Concert");
        event.setAction("CHICKEN");

        //act
        eventlog.addEvent(event);
    }


}
