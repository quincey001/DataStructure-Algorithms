package HackerRank;
import java.util.*;
public class HackerrankDay12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}


class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{
    private int[] testScores;
    Student(String firstName, String lastName, Integer idNumber, int[] score){
        super(firstName, lastName,idNumber);
        this.testScores = score;
    }

    public String calculate(){
        String grade = "";
        int total = 0;
        for(int s : testScores){
            total += s;
        }
        int average = total/testScores.length;
        if(average >= 90 && average <=100){
            grade = "O";
        }else if(average >= 80 && average <= 90){
            grade = "E";
        }else if(average >= 70 && average < 80){
            grade = "A";
        }else if(average >= 55 && average < 70){
            grade = "P";
        }else if(average >= 40 && average < 55){
            grade = "D";
        }else{
            grade = "T";
        }
        return grade;
    }
}
