/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

/**
 *
 * @author andrei.almeida
 */
public class Student {

    public String name;
    public Double grade1, grade2, grade3;

    public double finalGrade() {
        return this.grade1 + this.grade2 + this.grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
