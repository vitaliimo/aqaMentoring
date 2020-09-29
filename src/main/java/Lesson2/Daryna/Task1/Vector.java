package Lesson2.Daryna.Task1;

public class Vector {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void lengthOfVector(int x, int y, int z) {
        System.out.println(Math.sqrt(x ^ 2 + y ^ 2 + z ^ 2));
    }

    public void scalarMult(Vector v1, Vector v2) {
        int x1 = v1.getX();
        int y1 = v1.getY();
        int z1 = v1.getZ();

        int x2 = v2.getX();
        int y2 = v2.getY();
        int z2 = v2.getZ();

        System.out.println(x1 * x2 + y1 * y2 + z1 * z2);
    }
}
