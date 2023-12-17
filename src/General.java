// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class General<T extends Shape> {
    T x;

    General(T x) {
        this.x = x;
    }

    public void print(){
        this.x.draw();
    }
}
