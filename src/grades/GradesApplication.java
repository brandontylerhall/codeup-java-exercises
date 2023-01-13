package grades;

import util.Input;
import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {

    public static void main(String[] args) {

        Input in = new Input();
        boolean restart = true;

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("brandon");
        Student student2 = new Student("sky");
        Student student3 = new Student("gianna");
        Student student4 = new Student("taylor");

        /*grade setting*/
        student1.addGrade(79);
        student1.addGrade(86);
        student1.addGrade(95);

        student2.addGrade(48);
        student2.addGrade(62);
        student2.addGrade(55);

        student3.addGrade(84);
        student3.addGrade(35);
        student3.addGrade(74);

        student4.addGrade(90);
        student4.addGrade(83);
        student4.addGrade(79);

        /*puts the students into the hashmap*/
        students.put("brandontylerhall", student1);
        students.put("skyisheaven", student2);
        students.put("iamgianna", student3);
        students.put("69BjJgAmEr420", student4);

        while (restart) {
            System.out.println("\n Welcome! \n Here are the GitHub usernames of our students: \n");


            String studentString = "";
            for (HashMap.Entry<String, Student> student : students.entrySet()) {
                studentString += (" | " + student.getKey());
            }

            System.out.println(studentString + "\n");

            System.out.println("Which student would you like to see more information on? \n");
            System.out.print("> ");
            String studentSelect = in.getString();

            switch (studentSelect) {
                case "brandontylerhall":
                    System.out.println("Username: " + studentSelect);
                    System.out.println("Name: " + student1.getName());
                    System.out.println("Current Average: " + student1.getGradeAverage());
                    break;
                case "skyisheaven":
                    System.out.println("Username: " + studentSelect);
                    System.out.println("Name: " + student2.getName());
                    System.out.println("Current Average: " + student2.getGradeAverage());
                    break;
                case "iamgianna":
                    System.out.println("Username: " + studentSelect);
                    System.out.println("Name: " + student3.getName());
                    System.out.println("Current Average: " + student3.getGradeAverage());
                    break;
                case "69BjJgAmEr420":
                    System.out.println("Username: " + studentSelect);
                    System.out.println("Name: " + student4.getName());
                    System.out.println("Current Average: " + student4.getGradeAverage());
                    break;
                default:
                    System.out.println("That is not one of our students");
            }

            System.out.println("Would you like to see another student?");
            System.out.print("> ");
            restart = in.yesNo();
        }
        System.out.println("Goodbye, and have a wonderful day!");
    }
}