package src.main.java.com.mrbatista.gb2sdelivery.delivery.tracking.domain.exception;

public class DomainException extends RuntimeException {

    public DomainException() {
    }

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
