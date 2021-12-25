package br.com.alura.teste;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DataTime3 {

    public static void main(String[] args) {
        Date d = new Date();
        Instant i = d.toInstant();
        LocalDateTime ldt =
        LocalDateTime.ofInstant(i, ZoneId.systemDefault());

        Calendar c = Calendar.getInstance();
        Instant i2 = c.toInstant();
        LocalDateTime ldt2 =
                LocalDateTime.ofInstant(i2, ZoneId.systemDefault());

        Instant i1 = ldt.toInstant(ZoneOffset.UTC);
        Date d2 = Date.from(i1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);




    }
}
