package reallife;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EventServiceImpl implements EventService {

    private final ArrayList<Employee> employees;
    private final Random random;


    public EventServiceImpl(Random random) {
        this.random = random;
        employees = new ArrayList<Employee>();
        employees.add(new Employee("Hans", 20, ""));
        employees.add(new Employee("Anna", 26, ""));
        employees.add(new Employee("Peter", 19, ""));
        employees.add(new Employee("Julia", 35, ""));
        employees.add(new Employee("George", 42, ""));
    }

    @Override
    public List<Event> getAllEvents() {
        List<Event> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            EventType type = randomType();
            Employee employee = randomEmployee();
            list.add(new Event(type, employee));
        }
        return list;
    }

    private Employee randomEmployee() {
        return employees.get(random.nextInt(employees.size()));
    }

    private EventType randomType() {
        return EventType.values()[random.nextInt(EventType.values().length)];
    }

}
