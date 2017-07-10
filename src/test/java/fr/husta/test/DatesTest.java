package fr.husta.test;

import org.junit.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.Month;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public class DatesTest {

    @Test
    public void testLocalDate() throws Exception {
        LocalDate localDate1 = LocalDate.now();

        LocalDate localDate2 = LocalDate.of(2017, Month.AUGUST, 31);

        System.out.println(localDate2.format(DateTimeFormatter.ISO_DATE));
    }

    @Test
    public void testLocalDateTime() throws Exception {
        LocalDateTime localDateTime1 = LocalDateTime.now();

        LocalDateTime localDateTime2 = LocalDateTime.of(2017, Month.AUGUST, 31, 21, 32, 49);

        System.out.println(localDateTime2.format(DateTimeFormatter.ISO_DATE_TIME));
    }

    @Test
    public void testLocalTZ() throws Exception {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        ZoneId zoneId = zonedDateTime.getZone();
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneId);
        System.out.println(zoneOffset);
    }

}
