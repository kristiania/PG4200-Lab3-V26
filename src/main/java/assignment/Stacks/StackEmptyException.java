package assignment.Stacks;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String err) {
        super(err);
    }
}