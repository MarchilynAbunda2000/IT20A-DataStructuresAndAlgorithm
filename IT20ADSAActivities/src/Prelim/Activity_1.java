/*
IT20A Discussion September 9, 2024
Marchilyn Abunda
 */
package Prelim;

public class Activity_1 {

    public static void main(String[] args) {

        int marks[][] = {
            {77, 85, 68, 99, 87},
            {98, 56, 79, 90, 92},
            {78, 88, 56, 70, 99}
        };

        marks[2][3] = 75;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

    }

}
