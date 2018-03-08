package grades;

import java.util.ArrayList;

public class Student {
    private  String name;
    private ArrayList <Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
       int sum = 0;

        for  (int grade : grades) {
          sum += grade;
       }
         return sum / grades.size();

    }


    public static void main(String[] args) {
        Student student1 = new Student("James");
        student1.addGrade(90);
        Student student2 = new Student("Thomas");
        student2.addGrade(70);
        Student student3 = new Student("Maddie");
        student3.addGrade(100);
        Student student4 = new Student("Peter");
        student4.addGrade(85);
        Student student5 = new Student("Josh");
        student5.addGrade(90);
        System.out.println();
    }
}
