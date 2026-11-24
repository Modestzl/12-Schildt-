// Страница 259 книги (PDF 260). Частичная реализация должна быть abstract.
abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }

    // callback() намеренно не реализован.
}
