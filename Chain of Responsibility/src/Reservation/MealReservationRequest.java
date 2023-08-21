package Reservation;

public class MealReservationRequest implements ReservationRequest {
    @Override
    public void process() {
        System.out.println("Meal reservation request processed.");
    }
}
