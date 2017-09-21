package com.company;


import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList = new ArrayList<>();
    public boolean addEvent(Event event) {
        if (event == null) {
            throw new IllegalArgumentException();
        }
    };
    public int getNumEvents();
    public EventLog();
}
