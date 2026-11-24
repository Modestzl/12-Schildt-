// Страница 269 книги (PDF 270). Расширение контракта стандартным методом.
interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}
