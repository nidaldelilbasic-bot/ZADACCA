package v2;

public class Kvadar {
	int x, y, z;

    public Kvadar() {
        x = 2;
        y = 5;
        z = 9;
    }

    public Kvadar(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public int getVolumen() {
        return x * y * z;
    }
}
