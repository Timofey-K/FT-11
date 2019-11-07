package queueprior;

public class Klient {
    private int value;
    private String  name;
    private int prior;

    Klient(int v, String n, int prior) {
        this.value = v;
        this.name = n;

    }
    int getValue() {
        return value;
    }
    String getName() {
        return name;
    }

}
