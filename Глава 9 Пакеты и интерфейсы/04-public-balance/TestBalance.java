// Страница 254 книги (PDF 255). Использование класса из другого пакета.
import mypack.*;

class TestBalance {
    public static void main(String[] args) {
        // Balance и его конструктор открыты.
        Balance test = new Balance("J. J. Jaspers", 99.88);
        test.show(); // Метод show() также открыт.
    }
}
