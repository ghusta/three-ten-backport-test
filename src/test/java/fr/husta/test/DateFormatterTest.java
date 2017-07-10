package fr.husta.test;

import org.junit.Test;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public class DateFormatterTest {

    @Test
    public void test() throws Exception {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_DATE.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(zonedDateTime));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime));
    }

}
