public class TestTimeOnly {
    public static void main(String[] args) {
        TimeOnly d = new TimeOnly(2, 3, 4);
        
        try {
            d.setMinute(2);
            d.setSecond(30);
        }
        catch (IllegalArgumentException iae) {
            System.err.println("Problem with TimeOnly: " + iae.getMessage());
        }
        System.out.println(d);
    }
}
