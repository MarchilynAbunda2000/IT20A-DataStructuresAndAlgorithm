/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prelim;

/**
 *
 * @author Admin
 */
public class twoDArray {

    public static void main(String[] args) {
        // Step 1: Create a 2D array of students and their favorite subjects
        String students[][] = {
            {"John", "Math"},
            {"Maria", "Science"},
            {"Jane", "History"},
            {"Mark", "English"}
        };

        // Step 2: Display the initial array contents
        System.out.println("Initial Array:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i][0] + ", Favorite Subject: " + students[i][1]);
        }

        // Step 3: Modify one of the favorite subjects
        students[2][1] = "Art"; // Jane's favorite subject is changed to Art

        // Step 4: Display the updated array contents
        System.out.println("\n--- After modification ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i][0] + ", Favorite Subject: " + students[i][1]);
        }
    }
}
