package ua.lapshyn.hw7;

public class Aspirant extends Student {
    String scientificWork;

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }

    public Aspirant(String scienceWork, String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scienceWork;
    }

    public Aspirant() {
    }

    @Override
    public String toString() {
        return "Aspirant - ScientificWork: " +
                scientificWork + " - " +
                firstName + " " +
                lastName + " - " +
                group +
                " - average mark " + averageMark +
                " - scholarship " + getScholarship() +
                " -";
    }

}