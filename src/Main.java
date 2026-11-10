import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            printMenu();
            String line = in.nextLine().trim();
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number from the menu.");
                continue;
            }

            switch (choice) {
                case 1 -> System.out.println("Load input data: not implemented yet.");
                case 2 -> System.out.println("Generate timetable automatically: not implemented yet.");
                case 3 -> System.out.println("View timetable by year group: not implemented yet.");
                case 4 -> System.out.println("View all scheduled sessions: not implemented yet.");
                case 5 -> System.out.println("View unscheduled sessions and warnings: not implemented yet.");
                case 6 -> System.out.println("Modify / remove an assignment: not implemented yet.");
                case 7 -> System.out.println("Generate classroom request email: not implemented yet.");
                case 8 -> System.out.println("Save timetable to file: not implemented yet.");
                case 0 -> System.out.println("Goodbye.");
                default -> System.out.println("Unknown option: " + choice);
            }
        }
    }

    private static void printMenu() {
        System.out.println("==================================================");
        System.out.println(" DEPARTMENT COURSE TIMETABLE MANAGEMENT SYSTEM");
        System.out.println(" Software Engineering Department");
        System.out.println("==================================================");
        System.out.println(" 1. Load input data");
        System.out.println(" 2. Generate timetable automatically");
        System.out.println(" 3. View timetable by year group");
        System.out.println(" 4. View all scheduled sessions");
        System.out.println(" 5. View unscheduled sessions and warnings");
        System.out.println(" 6. Modify / remove an assignment");
        System.out.println(" 7. Generate classroom request email");
        System.out.println(" 8. Save timetable to file");
        System.out.println(" 0. Exit");
        System.out.println("--------------------------------------------------");
        System.out.print("Select an option: ");
    }
}
