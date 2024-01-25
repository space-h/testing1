public class TestTimestamp {
    public static void main(String[] args) {
        TimeOnly time = new TimeOnly(2, 3, 4);
        DateOnly date = new DateOnly(2006, 1, 20);
        DateTime dateTime = new DateTime(time, date);
        System.out.println(dateTime);
    }
}