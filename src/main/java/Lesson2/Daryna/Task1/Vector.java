package Lesson2.Daryna.Task1;

public class Vector {
    private int x;
    private int y;
    private int z;


    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double lengthOfVector() {
        return Math.sqrt(x ^ 2 + y ^ 2 + z ^ 2);
    }

    public double scalarMult(Vector v2) {
        return this.x * v2.x + this.y * v2.y + this.z * v2.z;
    }
}
