package br.com.alura.teste;

import java.time.Duration;
import java.time.Instant;

public class CalculoDatas {

    public static void main(String[] args) {

        Instant i = Instant.now();
        Duration dezSec = Duration.ofSeconds(10);
        Instant i2 = i.plus(dezSec);

        System.out.println(i);
        System.out.println(i2);

        Instant m1 = Instant.EPOCH;
        Instant m2 = Instant.now();

        long segundos = Duration.between(m1, m2).getSeconds();
        System.out.println(segundos);

    }
}
