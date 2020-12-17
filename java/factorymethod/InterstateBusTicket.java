package factorymethod;

import java.util.Calendar;

public class InterstateBusTicket extends Ticket {
    public InterstateBusTicket(String origin, String destiny, Calendar dateTime) {
        super(origin, destiny, dateTime);
    }

    @Override
    public void getDetails() {
        System.out.println("Interstate bus ticket: "
                + this.getOrigin() + " from " + this.getDestination()
                + " Date: " + super.dateFormat.format(this.getDateTime().getTime()));
    }
}