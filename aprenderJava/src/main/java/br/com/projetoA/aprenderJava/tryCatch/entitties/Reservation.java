package br.com.projetoA.aprenderJava.tryCatch.entitties;


import br.com.projetoA.aprenderJava.exceptions.DomainExceptions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


@NoArgsConstructor
@Getter
public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExceptions {
        if (!checkOut.after(checkIn)) {
            throw new DomainExceptions( "Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public long duration(){
        long dif = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif,TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkIn, Date checkOut) throws DomainExceptions {
        
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new IllegalArgumentException("Reservation dates for update must be future dates.");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainExceptions( "Check-out date must be after check-in date.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString(){
        return "Room "
                +roomNumber
                +", check-in: "+sdf.format(checkIn)
                +", check-out: "+sdf.format(checkOut)
                + ", "+duration()+" nights";
    }

}
