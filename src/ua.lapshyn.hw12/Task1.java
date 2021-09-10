package ua.lapshyn.hw12;

public class Task1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("I'm sure that I was here");
        }
    }
}