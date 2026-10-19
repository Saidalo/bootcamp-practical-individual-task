//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] studentMarks = {{1, 2}, {3, 4}};
        int studentsCount = 0;
        int total = 0;
        for(int[] row: studentMarks) {
            for(int mark: row) {
                total += mark;
                studentsCount++;
            }
        }
        double averageMark = (studentsCount > 0) ?  ((double) total / studentsCount) : 0.0d;
        System.out.println("Avarage student mark:" + averageMark);
    }
}