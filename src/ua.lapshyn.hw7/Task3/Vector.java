package ua.lapshyn.hw7;

import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double aX, double aY, double aZ, double bX, double bY, double bZ) {
        this.x = bX - aX;
        this.y = bY - aY;
        this.z = bZ - aZ;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Vector randomVectorGenerator() {
        double x = ThreadLocalRandom.current().nextDouble(-1000, 1000);
        double y = ThreadLocalRandom.current().nextDouble(-1000, 1000);
        double z = ThreadLocalRandom.current().nextDouble(-1000, 1000);
        return new Vector(x, y, z);
    }

    public static Vector[] randomVectorArray(int arrayLength) {
        Vector[] array = new Vector[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Vector().randomVectorGenerator();
        }
        return array;
    }

    @Override
    public String toString() {
        return "Vector " + "x=" + x + ", y=" + y + ", z=" + z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector vectorMultiplication(Vector vector) {
        return new Vector(this.y * vector.z - this.z * vector.y, this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x);
    }

    public double cosinus(Vector vector) {
        double scalarMultiplication = this.x * vector.x + this.y * vector.y + this.z * vector.z;
        return (scalarMultiplication) / (length() * vector.length());
    }

    public Vector sum(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    public Vector difference(Vector vector) {
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

}