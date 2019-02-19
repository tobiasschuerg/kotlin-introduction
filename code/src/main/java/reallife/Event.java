package reallife;

public class Event {

    private final EventType type;
    private final Employee employee;

    public Event(EventType type, Employee employee) {
        this.type = type;
        this.employee = employee;
    }
}
