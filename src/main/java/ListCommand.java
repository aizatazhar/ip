import java.util.StringJoiner;

public class ListCommand extends Command {
    ListCommand() {
        super(true);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        StringJoiner response = new StringJoiner("\n");
        for (int i = 0; i < tasks.size(); i++) {
            response.add(String.format("%d.%s", i+1, tasks.get(i)));
        }
        ui.printResponse(response.toString());
    }

    @Override
    public String toString() {
        return "list";
    }
}
