package com.company;

import org.junit.Test;

public class EventLogTest {

    @Test(expected = IllegalArgumentException.class)
    public void NullEventExpectsFalse() {
        //arrange
        EventLog eventlog = new EventLog();

        //act
        eventlog.addEvent(null);

        //assert
    }

}
