package event;

import log.Log;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event implements Log {
    // variables needed : Date, time, capacity, place, *created by???*
    private String eventName;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private Capacity capacity = new Capacity();

   public Event() {

   }

   public Event(String eventName, LocalDate date, LocalTime time, int maxCap, String location) {
       this.eventName = eventName;
       this.date = date;
       this.time = time;
       capacity.setMaxCap(maxCap);
       this.location = location;
   }
   @Override
   public String toString() {
       return String.format("%s, %s" + date + time, eventName, location);
   }

   // Accessor methods


    public String getEventName() {
        return eventName;
    }

    public LocalDate getDate() {
       return date;
   }

   public LocalTime getTime() {
       return time;
   }

   public String getLocation() {
       return location;
   }

   // Mutator methods
    public void setEvent(String eventName, LocalDate date, LocalTime time, int cap, String location) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        capacity.setMaxCap(cap);
        this.location = location;
    }

    public void setDate(LocalDate date) {
       this.date = date;
    }

    public void setTime(LocalTime time) {
       this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void log() {
       System.out.print("");
    }

}
