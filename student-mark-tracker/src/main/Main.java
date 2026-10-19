package main;

public class Main {
    private static final double EXCELLENT_START = 9.0;
    private static final double GOOD_START = 6.0;
    private static final double SATISFACTORY_START = 4.0;

    public static void main(String[] args) {
        int[][] studentMarks = {
                {10, 9, 9, 10},
                {7, 8, 6, 7},
                {5, 4, 5, 4},
                {3, 2, 4, 3}
        };

        for (int i = 0; i < studentMarks.length; i++) {
            double average = calculateAverage(studentMarks[i]);
            String result = classifyAverage(average);
            System.out.println("Student " + (i + 1) + ": average " + average + ", result " + result);
        }
        System.out.println("Pass percentage: " + calculatePassPercentage(studentMarks) + "%");
    }

    private static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    private static double calculatePassPercentage(int[][] studentMarks) {
        int passedCount = 0;
        for (int[] marks : studentMarks) {
            if (calculateAverage(marks) >= SATISFACTORY_START) {
                passedCount++;
            }
        }
        return (double) passedCount / studentMarks.length * 100;
    }

    private static String classifyAverage(double average) {
        if (average >= EXCELLENT_START) {
            return "Excellent";
        } else if (average >= GOOD_START) {
            return "Good";
        } else if (average >= SATISFACTORY_START) {
            return "Satisfactory";
        } else {
            return "Unsatisfactory";
        }
    }
}