package ladder;

public class NotValidNumberException extends IllegalArgumentException {
    private String message;

    NotValidNumberException(String variable) {
        this.message = "Not a valid number : varible = " + variable;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
