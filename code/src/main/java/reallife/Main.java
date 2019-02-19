package reallife;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String... args) {
        EventService eventService = new EventServiceImpl(new Random());
        List<Event> events = eventService.getAllEvents();

        // TODO: find user with most events and list them

        HashMap<Employee, List<Event>> map = new HashMap<>();
        events.forEach(new Consumer<Event>() {
            @Override
            public void accept(Event event) {
                Employee employee = event.getEmployee();
                if (map.containsKey(employee)) {
                    map.get(employee).add(event);
                } else {
                    ArrayList<Event> eventList = new ArrayList<>();
                    eventList.add(event);
                    map.put(employee, eventList);
                }
            }
        });

        final Employee[] max = new Employee[1];
        int maxCount = 0;
        map.forEach(new BiConsumer<Employee, List<Event>>() {
            @Override
            public void accept(Employee employee, List<Event> events) {
                if (events.size() > maxCount) {
                    max[0] = employee;
                }
            }
        });

        System.out.println(max[0].getName());
        List<Event> maxEvents = map.get(max[0]);
        maxEvents.forEach(new Consumer<Event>() {
            @Override
            public void accept(Event event) {

                // TODO: print length of holiday, date and time of converence
                System.out.println(" -> " + event.getType().name());
            }
        });

    }

}
