package ua.lapshyn.hw7;

public class Task2 {
    public static void main(String[] args) {
        Student std1 = new Student("Cobee", "Bryant", "group 1", 5);
        Student std2 = new Student("Ryan", "Giggs", "group 2", 3.9);
        Aspirant asp1 = new Aspirant("Football tactics", "Pep", "Guardiola", "group 3", 5);
        Aspirant asp2 = new Aspirant();
        asp2.scientificWork = "Football mentality";
        asp2.firstName = "Jurgen";
        asp2.lastName = "Klopp";
        asp2.group = "group 2";
        asp2.averageMark = 4.8;
        Student[] students = {std1, std2, asp1, asp2};
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}