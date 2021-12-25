package br.com.alura.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataTime2 {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        LocalDateTime ldt2 = ld.atTime(lt);
        LocalDateTime ldt3 = lt.atDate(ld);

    }
}
