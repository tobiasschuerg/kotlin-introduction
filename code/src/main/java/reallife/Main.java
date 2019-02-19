package reallife;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String... args) {
        EventService eventService = new EventServiceImpl(new Random());
        List<Event> events = eventService.getAllEvents();

        // TODO: find user with most events
    }

}
