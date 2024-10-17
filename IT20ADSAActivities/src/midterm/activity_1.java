/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abunda_lab_exercises;

public class activity_1 {

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

