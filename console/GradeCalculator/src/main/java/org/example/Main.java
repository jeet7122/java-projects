package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your total marks achieved");
        double marks = scanner.nextDouble();
        System.out.println("Please enter your total marks for outcome");
        double totalMarks = scanner.nextDouble();

        double result = calculateGrade(marks, totalMarks);
        System.out.println(result);

    }

    static double calculateGrade(double marks, double totalMarks){
        double solution = (marks/totalMarks) * 100.00;
        if(solution >= 80.00){
            System.out.println("A Grade");
            return 4.0;
        } else if (solution < 80 && solution >= 70) {
            System.out.println("B Grade");
            return 3.0;
        } else if (solution < 70 && solution >= 60) {
            System.out.println("C Grade");
            return 2.0;
        }
        else if ( solution < 60 && solution >= 50) {
            System.out.println("D Grade");
            return 1.0;
        }
        else {
            System.out.println("F Grade");
            return 0.0;
        }
    }
}