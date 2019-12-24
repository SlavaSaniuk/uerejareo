package by.bsac.time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class TimeUtilitiesTestCase {

    @Test
    public void timeBetweenInNanos_timeDifference_shouldReturnDifferenceInNanos() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plusNanos(10);
        Assertions.assertEquals(10L, TimeUtilities.timeBetweenInNanos(time1, time2));
    }

    @Test
    public void timeBetweenInMicros_timeDifference_shouldReturnDifferenceInMicros() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plusSeconds(10);
        Assertions.assertEquals(10000000L, TimeUtilities.timeBetweenInMicros(time1, time2));
    }

    @Test
    public void timeBetweenInMillis_timeDifference_shouldReturnDifferenceInMillis() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plusSeconds(10);
        Assertions.assertEquals(10000L, TimeUtilities.timeBetweenInMillis(time1, time2));
    }
}
