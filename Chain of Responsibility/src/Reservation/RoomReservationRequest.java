package Reservation;

public class RoomReservationRequest implements ReservationRequest {
    @Override
    public void process() {
        System.out.println("Room reservation request processed.");
    }
}