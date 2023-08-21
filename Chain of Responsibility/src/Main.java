import Reservation.*;

public class Main {
    public static void main(String[] args) {
        ReservationRequest roomRequest = new RoomReservationRequest();
        ReservationRequest mealRequest = new MealReservationRequest();
        ReservationRequest activityRequest = new ActivityReservationRequest();

        ReservationHandler roomHandler = new ReservationHandler(roomRequest);
        ReservationHandler mealHandler = new ReservationHandler(mealRequest);
        ReservationHandler activityHandler = new ReservationHandler(activityRequest);

        roomHandler.setNextHandler(mealHandler);
        mealHandler.setNextHandler(activityHandler);

        roomHandler.handleRequest();
    }
}