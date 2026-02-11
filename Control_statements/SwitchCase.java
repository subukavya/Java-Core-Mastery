public class SwitchCase {
    public static void main(String[] args) {

        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Option 3 selected");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
// The switch statement selects and executes one block of code from multiple options.
