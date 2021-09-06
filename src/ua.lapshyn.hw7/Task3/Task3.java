package ua.lapshyn.hw7;

public class Task3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2, -1, 4, -5, 4, 8);
        Vector vector2 = new Vector(1, 4, 6);
        Vector vector3 = new Vector().randomVectorGenerator();
        System.out.println("vector1 length = " + vector1.length());
        System.out.println("vector2 length = " + vector2.length());
        System.out.println("vector3 length = " + vector3.length());
        System.out.println("vector1 x vector2 = " + vector1.vectorMultiplication(vector2));
        System.out.println("vector1 + vector2 = " + vector1.sum(vector2));
        System.out.println("vector1 - vector2 = " + vector1.difference(vector2));
        System.out.println("cos φ = " + vector1.cosinus(vector2));
        Vector[] array = Vector.randomVectorArray(3);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array vector" + i + " = " + array[i]);
        }
    }

}