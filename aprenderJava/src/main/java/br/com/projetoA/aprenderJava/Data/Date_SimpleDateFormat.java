package br.com.projetoA.aprenderJava.Data;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Date_SimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");


        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2020 15:42:07");



        Timestamp t1 = Timestamp.valueOf(LocalDateTime.now());
        Timestamp t2 = new Timestamp(x2.getTime());
        System.out.println("Sem formatação: "+  y2+"  date formatado: "+sdf2.format(y2));

        //System.out.println("Date: "+sdf2.format(x1));
        System.out.println("TimeStamp: "+sdf2.format(t1)+"   t2: "+t2);

    }
}
