package Reservation;

public class ReservationHandler {
    private ReservationRequest request;
    private ReservationHandler nextHandler;

    public ReservationHandler(ReservationRequest request) {
        this.request = request;
    }

    public void setNextHandler(ReservationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest() {
        request.process();
        if (nextHandler != null) {
            nextHandler.handleRequest();
        }
    }
}