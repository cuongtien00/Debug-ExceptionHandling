package illegalTriangleException;

public class IllegalTriangleException extends Exception {
    private String massage;

    public IllegalTriangleException(String massage){
        super(massage);
        this.massage = massage;
    }

    @Override
    public String getMessage() {
        return massage;
    }
}
