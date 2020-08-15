import java.util.Scanner;

public class Duke {
    private static Todo todo = new Todo();

    public static void main(String[] args) {
        String greeting = "Hello! I'm Duke \nWhat can I do for you?";
        System.out.println(formatResponse(greeting));

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        while (!userInput.equals("bye")){
            if (userInput.equals("list")) {
                System.out.println(formatResponse(todo.toString()));
            } else {
                todo.addItem(userInput);
                System.out.println(formatResponse("added: " + userInput));
            }

            userInput = sc.nextLine();
        }

        System.out.println(formatResponse("Bye. Hope to see you again soon!"));
    }

    // Formats a given String by adding horizontal lines to the top and bottom
    // as well as indenting 1 tab
    private static String formatResponse(String string) {
        String horizontalLine = "----------------------------------------------------------------";
        return String.format("%s\n%s\n%s", horizontalLine, string, horizontalLine)
                .replaceAll("(?m)^", "\t");
    }
}
