import javax.swing.*;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Event e = new Event();
        e.createEvent();
        e.displayEventInfo();
        e.exportTextFile();
        e.readTextFile();
    }


}

public class NewClass {
    public class Event {

    String speakerName;
    String eventName;
    String eventDate;
    String eventTime;
    String eventLocation;
    int numParticipants;


    ArrayList<Event> events = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String file = " ";
    String line;
    ArrayList<String> textReader = new ArrayList<>();
    File fileName = new File(file);

    Event() {

    }

    Event(String speakerName, String eventName, String eventDate, String eventTime, String eventLocation, int numParticipants) {
        this.speakerName = speakerName;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.numParticipants = numParticipants;
    }

    public void createEvent() {
        System.out.println("How many events would you like to create?");
    
    
    
    
    
}
    }
}
