public class InvalidDeadlineException extends DukeException {
    InvalidDeadlineException() {
        super("You entered the deadline command incorrectly :(\n"
                + "The command format is \"deadline <task> /by <time>\"");
    }
}
