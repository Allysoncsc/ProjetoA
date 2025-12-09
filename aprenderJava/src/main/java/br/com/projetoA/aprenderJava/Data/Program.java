package br.com.projetoA.aprenderJava.Data;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {


        //instanciaData();
        //parseString();
        //formaterDate();

        LocalDate ld = instanciaLocalDate();
        LocalDate pastWeek = ld.minusDays(7);
        LocalDate nextWeek = ld.plusDays(7);
        System.out.println("Data atual: "+ld+"  pastWeek: "+pastWeek+"  nextWeek: "+nextWeek);

        Duration t61 = Duration.between(pastWeek.atStartOfDay(),nextWeek.atStartOfDay());

        System.out.println("Duration   Days: "+t61.toDays()+"   Hours: "+t61.toHours());
    }

    public static LocalDate instanciaLocalDate(){
        return LocalDate.now();
    }

    public static void instanciaData(){
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        System.out.println("localdate: "+d01+"   LocalDateTime: "+d02+" Instant(GNT-Grenwitch Londres): "+d03);
    }

    public static void parseString(){
        LocalDate d04 = LocalDate.parse("2023-07-04");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-04T20:01:01");
        Instant d06 = Instant.parse("2023-12-04T20:01:01Z");
        Instant d07 = Instant.parse("2023-12-04T20:01:01-03:00");
        System.out.println("localdate: "+d04+"   LocalDateTime: "+d05+ " Instant: "+d06+"  instant(BR): "+d07);
    }

    public static void formaterDate(){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //instant tem que informar o fuso horario
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        LocalDate d08 = LocalDate.parse("04/12/2022",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("04/12/2022 08:30",fmt2);
        LocalDate d10 = LocalDate.of(2022,12,04);
        LocalDate d04 = LocalDate.parse("2023-07-04");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-04T20:01:01");
        Instant d06 = Instant.parse("2023-12-04T20:01:01Z");

        System.out.println("d04 = "+d04.format(fmt1));
        System.out.println("FORMATANDO INSTANT: "+fmt3.format(d06));
    }


}
