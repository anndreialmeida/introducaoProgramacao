/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entites.Student;
import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Digite o nome do aluno: ");
        student.name = String.valueOf(input.nextLine());

        System.out.println("Digite as 3 notas do alunos");
        student.grade1 = Double.valueOf(input.nextLine());
        student.grade2 = Double.valueOf(input.nextLine());
        student.grade3 = Double.valueOf(input.nextLine());

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED" + "\n" + "MISSING " + student.missingPoints() + " POINTS");
        } else {
            System.out.println("PASS");
        }
    }
}
