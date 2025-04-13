import java.util.*;

public class DailyStudyPlanner {

    public static void main(String[] args) {
        StudyPlanService planService = new StudyPlanService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current day (1-9): ");

        int day = scanner.nextInt();
        scanner.close();

        String tasks = planService.getTasksForDay(day);
        System.out.println("\n📅 Tasks for Day " + day + ":");
        System.out.println(tasks);
    }
}
