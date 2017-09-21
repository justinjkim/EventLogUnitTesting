package com.company;


import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList = new ArrayList<>();
    public boolean addEvent(Event event) {
        if (event == null || event.name == null || event.action == null) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(event);
            eventList.add(event);
            return true;
        }
    };
    public int getNumEvents();
    public EventLog();
}
