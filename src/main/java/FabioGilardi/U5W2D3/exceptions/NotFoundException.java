package FabioGilardi.U5W2D3.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(long id) {
        super("Record with id: " + id + " has not been found!");
    }

}
