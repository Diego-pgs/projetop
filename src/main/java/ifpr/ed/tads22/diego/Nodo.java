package ifpr.ed.tads22.diego;

public class Nodo {
    private int value;
    private Nodo prox;
    private char code;
    private boolean ehBoolean;

    public char getCode() {
        return code;
    }
    public int getValue() {
        return this.value;
    }
    public Nodo getProx() {
        return this.prox;
    }
    public void setCode(char code) {
        this.code = code;
    }
    public void setBoolean(boolean ehBoolean) {
        this.ehBoolean = ehBoolean;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setProx(Nodo prox) {
        this.prox = prox;
    }
    public boolean isBoolean() {
        return ehBoolean;
    }
}
