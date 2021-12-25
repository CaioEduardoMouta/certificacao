package br.com.alura.teste;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTime1 {

        public static void main(String[] args) {
            /*
            LocalDate = Data sem hora
            LocalTime = Hora
            LocalDateTime = Data com hora
            MonthDay = Dia de um mes
            YearMonth = Mes e ano
             */

            LocalDate d = LocalDate.now();
            LocalTime t = LocalTime.now();
            LocalDateTime ldt = LocalDateTime.now();

            System.out.println(d);
            System.out.println(t);
            System.out.println(ldt);

            LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
            LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));

            System.out.println(t1);
            System.out.println(t2);

            LocalTime meioDia = LocalTime.of(12,0,21,33);

            LocalDate umNatal = LocalDate.of(2020,12,25);

            LocalDateTime algumMomento = LocalDateTime.of(2021,12,25,12,0);

            LocalDateTime almocoDeNatal = LocalDateTime.of(umNatal,meioDia);


            LocalDateTime AnoNovo = LocalDateTime.of(2021, 12,31,00,00);

            System.out.println(AnoNovo.getDayOfMonth());
            System.out.println(AnoNovo.getYear());
            System.out.println(AnoNovo.getMonth());
            System.out.println(AnoNovo.getHour());

            System.out.println(AnoNovo.get(ChronoField.DAY_OF_WEEK));
            System.out.println(AnoNovo.get(ChronoField.DAY_OF_MONTH));

            LocalDate ld =LocalDate.now();
            //ld.get(ChronoField.HOUR_OF_DAY);

            MonthDay day1 = MonthDay.of(1,1);
            MonthDay day2 = MonthDay.of(1,2);

            System.out.println(day1.isBefore(day2));
            System.out.println(day1.isAfter(day2));

            LocalDate e = LocalDate.of(2021,1,30);

            LocalDate d2 = d.withMonth(2);

            System.out.println(d);
            System.out.println(d2);

            LocalDate d3 = d.plusDays(5).plusMonths(3).minusYears(2);
            System.out.println(d3);

            LocalDate d4 = d.minus(4, ChronoUnit.YEARS);
            System.out.println(d4);



        }
}
