package exceptions;

public class AddFavoriteLodgingNotCompletedException extends AssertionError{
    public static final String ADD_FAVORITE_FAILED="the lodging could not be added to favorites";

    public AddFavoriteLodgingNotCompletedException(String message, Throwable cause){
        super(message, cause);
    }
}
