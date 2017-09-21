package com.company;


import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList = new ArrayList<>();

    public boolean addEvent(Event event) {
        if (event == null || event.name == null || event.action == null) {
            throw new IllegalArgumentException();
        } else if (!event.action.equals("Face2Face") || !event.action.equals("PhoneCall") || !event.action.equals("TextMessaging") || !event.action.equals("Unknown")) {
            throw new IllegalArgumentException("Action type must be one of following: Face2Face, PhoneCall, TextMessaging, Unknown");
        }
        else {
            System.out.println(event);
            eventList.add(event);
            return true;
        }
    };
    public int getNumEvents() {
        return eventList.size();
    };

    public EventLog() {
        // er...not too sure what instructions are asking. looks like we already initialized the eventList array?
    };
}
