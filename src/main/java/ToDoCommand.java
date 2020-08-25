public class ToDoCommand extends Command {
    String description;
    
    ToDoCommand(String description) {
        super(true);
        this.description = description;
    }

    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = new ToDo(description);
        tasks.add(task);
        storage.save(tasks);
        String response = String.format(
                "I've added this task:\n  %s \nNow you have %s tasks in the list.",
                task, tasks.size()
        );
        ui.printResponse(response);
    }

    @Override
    public String toString() {
        return "todo <task>";
    }
}
