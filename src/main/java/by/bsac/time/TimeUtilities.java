package by.bsac.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeUtilities {

    public static long timeBetweenInNanos(LocalTime time1, LocalTime time2) {
        return ChronoUnit.NANOS.between(time1, time2);
    }

    public static long timeBetweenInMicros(LocalTime time1, LocalTime time2) {
        return ChronoUnit.MICROS.between(time1, time2);
    }

    public static long timeBetweenInMillis(LocalTime time1, LocalTime time2) {
        return ChronoUnit.MILLIS.between(time1, time2);
    }

    public static long timeBetweenInSeconds(LocalTime time1, LocalTime time2) {
        return ChronoUnit.SECONDS.between(time1, time2);
    }

    public static long timeBetweenInMinutes(LocalTime time1, LocalTime time2) {
        return ChronoUnit.MINUTES.between(time1, time2);
    }

    public static long timeBetweenInHours(LocalTime time1, LocalTime time2) {
        return ChronoUnit.HOURS.between(time1, time2);
    }
}
