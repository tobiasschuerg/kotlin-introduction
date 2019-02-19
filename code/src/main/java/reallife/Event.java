package reallife;

public class Event {

    private final EventType type;
    private final Employee employee;

    private final String date;
    private final String conferenceTime;
    private final int conferencePrice;
    private final String trainingLocation;


    public Event(EventType type, Employee employee, String date, String conferenceTime, int conferencePrice, String trainingLocation) {
        this.type = type;
        this.employee = employee;
        this.date = date;
        this.conferenceTime = conferenceTime;
        this.conferencePrice = conferencePrice;
        this.trainingLocation = trainingLocation;
    }

    public EventType getType() {
        return type;
    }

    public Employee getEmployee() {
        return employee;
    }
}
