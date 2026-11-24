// Страница 259 книги (PDF 260). Частичная реализация должна быть abstract.
abstract class Incomplete implements Callback06Full {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }

    // ...
    // callback() намеренно не реализован.
}
