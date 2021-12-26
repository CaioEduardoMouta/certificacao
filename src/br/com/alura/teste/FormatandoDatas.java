package br.com.alura.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(agora));
        System.out.println(agora.format(formatter));

        LocalDate d1 = LocalDate.parse("16/07/1993",formatter);
        System.out.println(d1);



    }
}
