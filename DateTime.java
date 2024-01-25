public class DateTime {
    private TimeOnly time;
    private DateOnly date;

    public DateTime(TimeOnly time, DateOnly date) {
        this.time = time;
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString() + " " + time.toString();
    }
}