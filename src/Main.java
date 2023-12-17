public class Main {
        public static void main(String[] args) {
           General<Shape> rect = new General<>(new Rectangle(4,5));
           rect.print();
        }
    }