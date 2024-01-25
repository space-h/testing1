public class TimeOnly {
    
    private int hour;
    private int minute;
    private int second;


public TimeOnly(int hour, int minute, int second)
{
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}


public int getHour() {
    return hour;
}

public int getMinute() {
    return minute;
}

public int getSecond() {
    return second;
}

public void setHour(int hour) {
    if (hour < 0 || hour > 23) {
        throw new IllegalArgumentException("Hour must be between 0-23");
    }

    this.hour = hour;
}

public void setMinute(int minute) {
    if (minute < 0 || minute > 59) {
        throw new IllegalArgumentException("Minute must be between 0-59");
    }

    this.minute = minute;
}

public void setSecond(int second) {
    if (second < 0 || second > 59) {
        throw new IllegalArgumentException("Second must be between 0-59");
    }

    this.second = second;
}

@Override
public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
}

}