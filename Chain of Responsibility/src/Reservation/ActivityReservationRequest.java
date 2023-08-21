package Reservation;

public class ActivityReservationRequest implements ReservationRequest {
    @Override
    public void process() {
        System.out.println("Activity reservation request processed.");
    }
}
