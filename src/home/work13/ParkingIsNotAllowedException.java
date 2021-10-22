package home.work13;

public class ParkingIsNotAllowedException extends Exception {

    public ParkingIsNotAllowedException() {
    }

    public ParkingIsNotAllowedException(String message) {
        super(message);
    }
}
